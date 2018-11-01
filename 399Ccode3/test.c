/*
 * test.c
 *
 *  Created on: Feb 23, 2017
 *      Author: Sweitz
 */

#include<stdio.h>

int main(void)
{
		unsigned char one = 245;
		char two = one;
		printf("#1 value is %d",two);

		int three = -32;
		char four = three;
		printf("\n#4 value is %d",three);

		int five = 2147483650;
		unsigned int six = five;
		printf("\n#6 value is %d",six);

		return 0;
}
