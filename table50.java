//to find out the table of any no. with factor ranging from 1 to 10
import java.util.Scanner;
class table50
{
public static void main(String args[])
{
int i=0,n=0,table;
System.out.println("Enter the table number you want to enter");
Scanner s=new Scanner(System.in);
n=s.nextInt();
while(i<=10)
{
table=i*n;
System.out.println(+table);
i++;
}
}
}
