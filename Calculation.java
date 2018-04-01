class Calculation
{
public void addition(int x,int y)
{
int z=x+y;
System.out.pritnln("The sum of the given nos."+z);
}
public void Subtraction(int x,int y){
int z=x-y;
System.out.println("The difference b/w the nos"+z);
}
}
class MyCalculation extends Calculation
{
public void multiplication(int x,int y){
int x=x*y;
System.out.println("The product of the given nos."+z);
}
public static void main(String args[])
{
int a=20,b=10;
MyCalculation1 demo=new Calculation1();
demo.addition(a,b);
demo.subtraction(a,b);
demo.multiplication(a,b);
}
}