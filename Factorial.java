import java.util.Scanner;
class Factorial
{
public static void main(String args[])
{
int n,c,fact=1;
System.out.println("Enter a interger to calculate its factorial");
Scanner in=new Scanner (System.in);
n=in.nextInt();
if(n<0)
{
System.out.println("No should be non-negative");
}
else
{
for(c=1;c<=n;c++)
fact=fact*c;
System.out.println("Factorial of"+n+"is="+fact);
}
}
}
