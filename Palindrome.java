import java.util.*;
class Palindrome
{
public static void main(String args[])
{
String original,reverse="",i;
Scanner.in=new Scanner(System.in);

System.out.println("Enter a string , to check if it is a palindrrome");

original=in.nextLine();

int length=original.length();

for(i=length-1;i>=0;i--)
{
reverse=reverse+original.length(i);

if(original.equals(i))
{
System.out.println("Entered string is a plaindrome");
}
else
{
System.out.pritnln("Entered string is not a palindrome");
}
}
}
}