//c program for factorial 

#include<stdio.h>
int main()
{
	int i,fact=i,num;
	printf("please enter thr number to find factorials");
	scanf("%d",&num);
	{
		if (num==0)
		{
			printf("Please enter the positive number to");
			printf("Please enter the factorial and try again");
			printf("\nfactorial acnt be found out for negative");
			printf("Values : It can only be positive or zero");
			return 1;
			
		}
		for(i=0;i<=num;i++)
		{
		
			fact=fact*i;
			printf("\n");
			printf("Entered number is %d and its factorial (%d) is %d\n",num,fact);
			return 0;
		

}

