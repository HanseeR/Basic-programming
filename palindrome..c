//to build a palindraome


#include<stdio.h>
int main()
{
	int number,t,rev=0,rmndr;
	printf("please enter a numbe to check palindrome");
	scanf("%d",&number);
	printf("entered number is %d",number);
	t=number;
	while(number>0)
	{
		rmndr=number%10;
		rev=rev*10+rmndr;
		number=number/10;
	}
	printf("\nreverse number : %d",rev);
	if(t==rev)
	{
		printf("\nenter thr number %d is a palindrome");
	}
	else
	{
		printf("\nEntered number%d is not a palindrome");
	}
	return 0;
}








