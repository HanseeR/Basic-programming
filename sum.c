/*documenation section c program and basics*/

#include<stdio.h> /*link section*/
int total =0; /*global declaration . definition section*/
int sum(int ,int); /*function declaration section*/
int main()/*main function*/
{
	printf("this is a c program\n");
	total=sum(1,1);
	printf("The sum pf two numbers=%d\n",total);
	return 0;
}
int sum(int a,int b)/*user defined function*/
{
	return a+b; /*definition scetion*/
}
