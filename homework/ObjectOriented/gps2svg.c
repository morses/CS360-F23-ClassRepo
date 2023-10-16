#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <float.h>
#include "gps.h"
#include "arraylist.h"

// Update: now needs the math library
// gcc -std=c99 gps.c arraylist.c gps2svg.c -o gps2svg.out -lm
// ./gps2svg.out data/example.dat output/example.svg

int main(int argc, char * argv[]) 
{
    if(argc != 3)
	{
		printf("Usage: %s inputGPS.txt outputSVG.svg\n", argv[0]);
		exit(EXIT_FAILURE);
	}

    FILE * fin;
    const int BUF_SIZE = 100;
    char line[BUF_SIZE];
    char buf[100];

    fin = fopen(argv[1], "r");
    if(!fin)
	{
		fprintf(stderr, "Can't open file %s", argv[1]);
		exit(EXIT_FAILURE);
	}

    arraylist * list = arraylist_create();
    float latitude_min = FLT_MAX;
    float latitude_max = -FLT_MAX;
    float longitude_min = FLT_MAX;
    float longitude_max = -FLT_MAX;
    float latitude_width;
    float longitude_width;

    while (fgets(line, BUF_SIZE, fin) != NULL) 
    {
        struct gps * obj = gps_parse_nmea0183_sentence(line);
        if(obj != NULL && obj->valid_satellite_fix)
        {
            // For debugging, print out each one
            //gps_print(obj, stdout);   // or
            //gps_format(obj,buf);
            //puts(buf);
            arraylist_add(list,obj);
            // Find bounds
            if(obj->latitude < latitude_min)
                latitude_min = obj->latitude;
            if(obj->latitude > latitude_max)
                latitude_max = obj->latitude;
            if(obj->longitude < longitude_min)
                longitude_min = obj->longitude;
            if(obj->longitude > longitude_max)
                longitude_max = obj->longitude;
        }
    }
    //printf("Latitude bounds : %f, %f\n",latitude_min,latitude_max);
    //printf("Longitude bounds: %f, %f\n",longitude_min,longitude_max);

    // ------------- At this point we have all the data we need, so can generate svg file now
    FILE * fout = fopen(argv[2], "w");
    if(!fout)
	{
		fprintf(stderr, "Can't open file for writing: %s\n", argv[2]);
        // clean up
        for(unsigned int i = 0; i < arraylist_size(list); i++)
        {
            gps_destroy(arraylist_get(list,i));
        }

        arraylist_destroy(list);
        fclose(fin);
        exit(EXIT_FAILURE);
	}

    // Write the SVG file header
    // width, height and viewbox are hard-coded right now for convenience -- would be easy to have them be inputs to this program
    int width = 1024;
    int height = 1024;
    fprintf(fout, "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n");
    fprintf(fout, "<!DOCTYPE svg PUBLIC \"-//W3C//DTD SVG 1.1//EN\" \"http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd\">\n");
    fprintf(fout, "<svg width=\"1024\" height=\"1024\" viewBox=\"-50 -50 1124 1124\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\">\n");
    fprintf(fout, "\t<g opacity=\"0.8\">\n");
    //fprintf(fout, "\t\t<circle cx=\"125\" cy=\"125\" r=\"75\" fill=\"orange\" />\n");

    fprintf(fout, "\t\t<polyline points=\"");

    longitude_width = longitude_max - longitude_min;
    latitude_width = latitude_max - latitude_min;
    for(unsigned int i = 0; i < arraylist_size(list); i++)
    {
        struct gps * obj = (struct gps *)arraylist_get(list,i);
        float x = width * (obj->longitude - longitude_min)/longitude_width;
        float y = height - height * (obj->latitude - latitude_min)/latitude_width;
        fprintf(fout, "%d,%d ",(int)x,(int)y);
    }
    fprintf(fout, "\" stroke=\"red\" stroke-width=\"4\" fill=\"none\" />\n");

    fprintf(fout, "\t</g>\n");
    fprintf(fout, "</svg>\n");
    // ------------- Free all resources
    for(unsigned int i = 0; i < arraylist_size(list); i++)
    {
        gps_destroy(arraylist_get(list,i));
    }

    arraylist_destroy(list);
    fclose(fin);
    fclose(fout);
    return 0;
}
