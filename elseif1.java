import java.util.Scanner;

class elseif1
{

public static void main(String args[])

{

int a,b,c;

Scanner s=new Scanner(System.in);

System.out.println("Enter the values of a,b and c to check the greatest, middle and smallest number");

a=s.nextInt();
b=s.nextInt();
c=s.nextInt();



if(a>b&&b>c)
{
System.out.println("We get that a is greater b is in the middle and c is the smallest");
}

else if(b>a&&a>c)
{
System.out.println("b is the greatest  a is in the middle and c is the smallest");
}

else if(c>a&&a>b)
{
System.out.println("c is the greatest a is in the middle and cb is the smallest");
}

}

}

















