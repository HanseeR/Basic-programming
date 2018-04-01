//ommitting the condition statement in the for loop


#include<stdio.h>
int main()
{
	int i,n,a,b,sum=0;
	printf("Enter the number of terms");
	scanf("%d",&n);
	a=0;
	b=1;
	printf("%dn %d",a,b);
	for(i=2; ;i++)
	{
		if(i==(n-1))
		//condition specified using if ststement
		break;
		sum=a+b;
		printf("n%d",sum);
		a=b;
		b=sum;
	}
	
	return 0;
}
