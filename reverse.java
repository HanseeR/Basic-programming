//to print the values from 10 to 1

import java.util.Scanner;
class reverse
{
public static void main(String args[])
{
int i=10;
System.out.println("Enter the reverse series of the numbers");
Scanner s=new Scanner(System.in);
i=s.nextInt();
while(i>=1)
{
System.out.println(+i);
i--;
}
}
}
