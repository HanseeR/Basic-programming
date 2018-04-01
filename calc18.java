import java.util.Scanner;
class calc18
{
public static void main(String args[])
{
int a,b,c;
Scanner s=new Scanner(System.in);
System.out.println("Enter the values of a,b,c");
{
a=s.nextInt();
b=s.nextInt();
c=a+b;
System.out.println(+c);
}
{
if(a>b)
{
a=s.nextInt();
b=s.nextInt();
c=a-b;
System.out.println(+c);
}
{
a=s.nextInt();
b=s.nextInt();
c=a*b;
System.out.println(+c);
}
if(a>b)
{
a=s.nextInt();
b=s.nextInt();
c=a/b;
System.out.println(+c);
}
}
}
}