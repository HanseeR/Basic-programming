//to count the number of objects in a class with the help of static data number


#include<iostream>
#include<conio.h>

class stat
{
	int code;
	
	static int count;
	
	public:
	
	stat()
	
	{
		code=++count;
     } 
     
	 void showcode()
	
	 {
	 	cout<<"\n\tObject number is:"<<code;
	 }
	
	 static void showcount()
	 {
	 	cout<<"\n\tCount Objects:"<<count;
	}
};

int stat::count;

void main()

{
	clrscr();
	stat obj1,obj2;
	
	obj1.showcount();
	obj2.showcode();
	obj2.showcount();
	obj2.showcode();
	getch();
	
}


































 
