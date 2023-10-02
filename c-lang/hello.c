#include <stdio.h>

int main(int argc, char *argv[])
{
    printf("Hello World!\n"); 

    int a;
    a = 10;    //a = "Hello World!";
    /* This is multi-line
    
     comment. */

    printf("a = %d\n", a);

    char b = 'b';
    char c = 0xA0;
    double d = 7.4e14;

    unsigned int e = 0x7FFFFFFF;

    //int d = 89;

    printf("d = %d\n", d);


    return 0;
}