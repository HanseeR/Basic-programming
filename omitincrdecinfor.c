//ommitting  incement/decrment expression


#include<stdio.h>
int main()
{
	int i,n,a,b,sum=0;
	printf("Enter the number of terms");
	scanf("%d",&n);
	a=0;
	b=1;
	printf("%dn %d",a,b);
	for(i=2;i<2;)
	{
		sum=a+b;
		printf("n%d",sum);
		a=b;
		b=sum;
		i++;
		//incement expression
	}
	return 0;
	}

