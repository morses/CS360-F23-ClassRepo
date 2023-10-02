#include <stdio.h>

int main(int argc, char *argv[])
{
    // (type goes here) (identifier goes here) = (value goes here);
    int * pi = 0xFFFFFFFFFFFFFFFF;
    double * pd = 0x0000000000000000;
    char * pc;
    float * pf;
    void * pv;
    unsigned int * pui;

    int a = 7;
    pi = &a;

    printf("a = %d\n", a);
    printf("&a = %p\n", &a);

    printf("pi = %p\n", pi);
    printf("&pi = %p\n", &pi);

    printf("*pi = %d\n", *pi);

    a = 10;
    int b = a * 2;

    *pi = 9;

    printf("a = %d\n", a);
}