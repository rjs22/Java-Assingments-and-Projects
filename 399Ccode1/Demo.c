/*
 * Demo.c
 *
 *  Created on: Feb 14, 2017
 *      Author: Sweitz
 */
#include <stdio.h>
#include <string.h>

void copyDataBad(char *id)
{
	char smallerBuffer[10];
	strcpy(smallerBuffer, id);
}

int main(void)
{
		char *userId = "0123456789";
		copyDataBad(userId);
		return 0;
}
