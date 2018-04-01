//to check ehethet the two strings are equal or not'


#include<stdio.h>

#include<string.h>

int main()
{
	
	char a[20],b[20];
	
	printf("\n enter the first string");
	
	scanf("%s",&a);
	
	printf("enter the second string");
	
	scanf("%s",&b);
	
	if(strcmp(a,b)==0)
	
	{
		
		printf("\n the strings are equal");
		
	}
	
	else 
	{
		
		printf("The strings are different");
		
    }

}
