#include <stdio.h>
#include <stdlib.h>

struct Car {
    char make[20];
    char model[20];
    int year;
    float price;
};

// statically allocated array, initialized to zero
float b[10];
struct Car cars[10];

const int SIZE = 10;

//float farr[SIZE];

// function to print all the integers in an array of ints
void print_ints(int * arr, int size)
{
    for(int i = 0; i < size; i++)
    {
        printf("arr[%d] = %d\n", i, arr[i]);
    }
}

void printCars(struct Car cars[], int size)
{
    for(int i = 0; i < size; i++)
    {
        printf("cars[%d].year = %d\n", i, cars[i].year);
    }
}

int main(int argc, char *argv[])
{
    // print all command line arguments
    for(int i = 0; i < argc; i++)
    {
        printf("argv[%d] = %s\n", i, argv[i]);
    }

    printf("b[0] = %f\n", b[0]);

    // stack allocated array, uninitialized
    unsigned short us[10];
    printf("us[0] = %d\n", us[0]);

    for(int i = 0; i < 11; i++)
    {
        us[i] = i;
    }

    print_ints((int *)us, 10);

    for(int i = 0; i < 11; i++)
    {
        printf("us[i] = %d\n", us[i]);
    }

    // dynamically allocated array
    int * pi = (int *)malloc(10 * sizeof(int));
    *pi = 5;        // same as arr[0] = 5;
    *(pi + 1) = 6;  // same as arr[1] = 6;
    *(pi + 2) = 7;  // same as arr[2] = 7;
    // pointer arithmetic
    for(int i = 0; i < 10; i++)
    {
        *(pi + i) = 2*i;
    }

    for(int i = 0; i < 10; i++)
    {
        printf("*(pi + i) = %d\n", *(pi + i));
    }

    // You don't have to use pointer arithmetic because 
    // the array name is a pointer to the first element
    for(int i = 0; i < 10; i++)
    {
        pi[i] = 5*i;
    }
    for(int i = 0; i < 10; i++)
    {
        printf("pi[i] = %d\n", pi[i]);
    }

    // dynamically allocated array of structs
    struct Car * pcar = (struct Car *)malloc(10 * sizeof(struct Car));

    // null terminated strings
    char name[5] = "ABCDE";
    printf("%s\n",name);
    for(int i = 0; i < 6; i++)
    {
        printf("%d ",name[i]);
    }

}