#include <stdio.h>
#include <stdlib.h>     // for malloc

/* Show addresses of various elements of a C program.  Fill in
   with permissions with pmap.

     gcc inspect.c && ./a.out one 2 "hello world"

   And in another terminal
     pmap -X `pidof a.out`
     pmap -x `pidof a.out`

   Also use objdump to see contents of the executable file:
     objdump -sd a.out
 */

void foo(int,int);

/* Variables with file scope go in 
    .data if initialized
    .bss if uninitialized
    and in read-only section if constant
*/
int initialSize = 50;
char * welcomeString = "Hello World!";
const float PI = 3.141592653589793;
double fraction;
double values[55];

struct point 
{
    float x;
    float y;
};

int main(int argc, char * argv[])
{
    /* 
        .text  (the code itself) 
    */
    printf(".text\n");
    printf("-----\n");
    printf("\tAddress of main(): %p\n",main);
    printf("\tAddress of foo() : %p\n",foo);

    /* .data   (initialized data) */
    static int max = 10;
    printf(".data\n");
    printf("-----\n");
    printf("\t &PI:              %p\n",&PI);
    printf("\t &max:             %p\n",&max);
    printf("\t &initialSize:     %p\n",&initialSize);
    printf("\t &welcomeString:   %p\n",&welcomeString);
    printf("\t welcomeString:    %p\n",welcomeString);

    /* .bss    (uninitialized data) */
    printf(".bss\n");
    printf("----\n");
    printf("\t &fraction:        %p\n",&fraction);
    printf("\t &values:          %p\n",&values);
    printf("\t &values[0]:       %p\n",&values[0]);
    printf("\t &values[54]:      %p\n",&values[54]);

    /* Heap */
    printf("heap\n");
    printf("----\n");
    int * parr = (int *)malloc(256*sizeof(int));  // array of 256 ints
    printf("\t &parr:            %p\n",&parr);
    printf("\t &parr[0]:         %p\n",&parr[0]);
    printf("\t &parr[255]:       %p\n",&parr[255]);
    struct point * points = (struct point *)malloc(100*sizeof(struct point));
    printf("\t &points[0]:       %p\n",&points[0]);
    printf("\t &points[99]:      %p\n",&points[99]);

    /* Stack */
    printf("stack\n");
    printf("-----\n");
    printf("\ta variable in main()\n");
    short aNumber = 66;
    printf("\t &aNumber:         %p\n",&aNumber);
    printf("\tvariables in foo, called recursively\n");
    foo(0,9);

    /*
        Command line args 
    */
    printf("command line args\n");
    printf("-----------------\n");
    printf("\tThere are %d command line arguments: \n",argc);
    printf("\t#\taddress\t\tvalue\n");
    for(int i = 0; i < argc; i++)
    {
        printf("\t%-5d\t%-12s\t%-12p\n",i,argv[i],argv[i]);
    }

    getchar();  // wait for a character from stdin so we can inspect this process
    free(parr);
    free(points);
    return 0;
}

/*  A function we can use to watch the stack grow.  To do this we use
    recursion and print out the address of an automatic variable each
    invokation.
*/
void foo(int n, int max)
{
    int remaining = max - n;     // local variable, allocated on the stack

    printf("\tfoo(%d,%d): &remaining: %p\n",n,max,&remaining);
    if(remaining > 0)
    {
        foo(n + 1, max);
    }
    // Put something after the recursive call so that an optimizing compiler
    // won't unroll this recursion and turn it into a loop
    if(n == 28)
    {
        printf("n is 28!!\n");
    }
}