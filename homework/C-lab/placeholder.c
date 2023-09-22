/*  CS 360 Homework 1 -- Imperative paradigm, C language */

#include <stdio.h>
#include <stdlib.h>
#include <png.h>

int main(int argc, char ** argv)
{
	// Make sure we have the name of the file to create
	if(argc != 2)
	{
		printf("Usage: %s placeholder.png\n", argv[0]);
		exit(EXIT_FAILURE);
	}

    // Open the file to write to.  If it exists it will be overwritten.
    FILE * fp = fopen(argv[1], "wb");
	if(!fp)
	{
		fprintf( stderr, "Can't open file %s", argv[1] );
		exit(EXIT_FAILURE);
	}

    // Dimensions of image to create
    const int width = 388;
    const int height = 240;

    // Initialize libPNG, obtaining pointers to a write struct, and an info struct that we will use later
    // These structs are allocated on the heap by libPNG
    png_structp png_ptr = png_create_write_struct(PNG_LIBPNG_VER_STRING, NULL, NULL, NULL);
    if(!png_ptr)
    {
        fprintf(stderr, "Could not create libpng write structure");
        exit(EXIT_FAILURE);
    }

    png_infop info_ptr = png_create_info_struct(png_ptr);
    if(!info_ptr)
    {
       png_destroy_write_struct(&png_ptr,(png_infopp)NULL);
       fprintf(stderr, "Could not create libpng info structure");
       exit(EXIT_FAILURE);
    }

    // Set up the error handling that libPNG expects
    if(setjmp(png_jmpbuf(png_ptr)))
    {
       png_destroy_write_struct(&png_ptr, &info_ptr);
       fclose(fp);
       fprintf(stderr, "An error occurred while libPNG was reading or writing data\n");
       exit(EXIT_FAILURE);
    }

    // Attach our file pointer so it knows where to write data to
    png_init_io(png_ptr, fp);

    // Specify dimensions, 8 bits per color, RGB, no interlacing, 
    png_set_IHDR(png_ptr, info_ptr, width, height, 8, PNG_COLOR_TYPE_RGB, PNG_INTERLACE_NONE, PNG_COMPRESSION_TYPE_DEFAULT, PNG_FILTER_TYPE_DEFAULT);

    // Add title and description
    png_text text[2];
	text[1].compression = PNG_TEXT_COMPRESSION_NONE;
	text[1].key = "Title";
	text[1].text = "P388x240";
    text[2].compression = PNG_TEXT_COMPRESSION_NONE;
    text[2].key = "Author";
	text[2].text = "Scot Morse";
	png_set_text(png_ptr, info_ptr, text, 2);
    
    // Actually write the header info
    png_write_info(png_ptr, info_ptr);

    // Now we're ready to write the actual image data
    //   allocate an array, i.e. a column, of pointers
    png_bytep * row_ptrs = (png_bytep *)malloc(sizeof(png_bytep) * height);
    //   then have each of those point to an array for each row
    for(int j = 0; j < height; j++)
    {
        row_ptrs[j] = (png_bytep)malloc(sizeof(png_byte) * 3 * width);
    }
    
    // Now we're ready to create the image.  Write the data in row_ptrs in RGB format.



    // Now write out this data to the file
    png_write_image(png_ptr, row_ptrs);

    // Finish writing (no more metadata or anything)
    png_write_end(png_ptr, NULL);

    // Clean up before exiting

    // free each row
    for(int j = 0; j < height; j++)
    {
        free(row_ptrs[j]);
    }
    // then the array of row pointers

    // free all the resources that libpng allocated
    png_destroy_write_struct(&png_ptr, &info_ptr);
    return EXIT_SUCCESS;
}
