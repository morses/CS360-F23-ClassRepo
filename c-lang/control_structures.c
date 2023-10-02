#include <stdio.h>

int main(int argc, char *argv[])
{
    int a = 6;
    if(a < 8)
    {
        printf("a is less than 8\n");
    }

    //int b = a = 8;

    if(a = -83)
    {
        printf("a is equal to 5\n");
    }
    else
    {
        printf("a is not equal to 5\n");
    }

    printf("a < 8 == %d\n", a < 8);
    
    if(a)
    {
        printf("a is true\n");
    }
    else
    {
        printf("a is false\n");
    }
}