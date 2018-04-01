//usdge of do-while


#include<stdio.h>
int main()
{
	int n,a,sum=0;
	printf("\n enter the number");
	scanf("%d",&n);
	
	do
	{
		n=n%10;
		sum=sum+a;
		n=n/10;
    }
    
    while(n>0);
    printf("\nsum of the digits %d",sum);
    return 0;
}

