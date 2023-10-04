#include <stdio.h>
#include "math.h"

#define MAX 10
#define TO_RADIANS(x) (x * 0.0174532925)

// function prototype
//int add(int,int);

int main(int argc, char ** argv)
{
    int a = 2;
    printf("a = %d\n", a);
    int c = add(1, 2);
    printf("c = %d\n", c);
    return 0;
}

// int add(int a, int b)
// {
//     return a + b;
// }
