#include<stdio.h>

enum Rainbow {Red,Orange,Yellow,Green,Blue,Indigo,Violet};

int main(void)
{
	printf("Hello world\n");
	enum Rainbow bow;
	bow = Yellow;

	if( bow == Yellow )
	{
		printf("Rainbow is Yellow\n");
	}
	bow = Indigo;
	//bow = 200;
	switch( bow )
	{
		case Red:
			printf("Red %d\n",bow);
			break;
		case Orange:
			printf("Orange %d\n",bow);
			break;
		case Yellow:
			printf("Yellow %d\n",bow);
			break;
		case Green:
			printf("Green %d\n",bow);
			break;
		case Blue:
			printf("Blue %d\n",bow);
			break;
		case Indigo:
			printf("Indigo %d\n",bow);
			break;
		case Violet:
			printf("Violet %d\n",bow);
			break;
	}
	bow = 200;

	printf("Bytes used to store enum Rainbow = %ld\n",sizeof(enum Rainbow));
}
