#include <stdio.h>
#include <stddef.h>
#include <limits.h>
#include <inttypes.h>

int main(void)
{
    /* Data types. YMMV depending on hardware. */
    printf("Sizes of various data types, in bytes.\n");
    printf("Type\t\tbytes\n");
    //printf("WORD_BIT\t%d:\n",WORD_BIT);
    printf("char\t\t%2lu \n", sizeof(char));
    printf("short\t\t%2lu \n", sizeof(short));
    printf("int\t\t%2lu \n", sizeof(int));
    printf("float\t\t%2lu \n", sizeof(float));
    printf("double\t\t%2lu \n", sizeof(double));
    printf("size_t\t\t%2lu \n", sizeof(size_t));
    printf("wchar_t\t\t%2lu \n", sizeof(wchar_t));
    printf("ptrdiff_t\t%2lu \n", sizeof(ptrdiff_t));
    printf("---\n");
    printf("int8_t\t\t%2lu \n", sizeof(int8_t));
    printf("uint8_t\t\t%2lu \n", sizeof(uint8_t));
    printf("int16_t\t\t%2lu \n", sizeof(int16_t));
    printf("uint16_t\t%2lu \n", sizeof(uint16_t));
    printf("int32_t\t\t%2lu \n", sizeof(int32_t));
    printf("uint32_t\t%2lu \n", sizeof(uint32_t));
    printf("int64_t\t\t%2lu \n", sizeof(int64_t));
    printf("uint64_t\t%2lu \n", sizeof(uint64_t));
    printf("---\n");
    printf("unsigned short int\t%2lu \n", sizeof(unsigned short int));
    printf("long long\t\t%2lu \n", sizeof(long long));
    printf("long double\t\t%2lu \n", sizeof(long double));
    printf("---\n");
    printf("char *\t\t%2lu \n", sizeof(char *));
    printf("short *\t\t%2lu \n", sizeof(short *));
    printf("int *\t\t%2lu \n", sizeof(int *));
    printf("float *\t\t%2lu \n", sizeof(float *));
    printf("double *\t%2lu \n", sizeof(double *));
    printf("void *\t\t%2lu \n", sizeof(void *));
    printf("char**\t\t%2lu \n", sizeof(char **));
    int a = 5;
    printf("a = 5\n");
    printf("&a\t\t%2lu \n", sizeof(&a));
}
