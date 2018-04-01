/*WAP in C++ to define a class Complex to represent a set of all the numbers. Overload '+' operator to add two complex numbers using number function of the class and overload 
'*' operator to multiply two complex numbers using friend function of the class complex.*/

#include<iostream>
using namespace std;
class A
{
	int a,b;
	public :
		A(){};
		A(int i,int j)
		{
			a=i;
			b=j;
			
		}
		void show()
		{
			cout<<a<<"+j"<<b;
		}
		
		A operator +(A);
};
	A A::operator +(A obj)
	{
		A temp;
		temp.a=a+obj.a;
		temp.b=b+obj.b;
		return(temp);
		
	}
	
	int main()
	{
		A c1(5,6),c2(7,8),c3;
		cout<<"\nThe !st no. is";
		c1.show();
		cout<<"\nThe second no. is";
		c2.show();
		c3=c1+c2;
		cout<<"\nSum is";
		c3.show();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
