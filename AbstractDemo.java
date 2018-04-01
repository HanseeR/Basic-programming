class Employee
{
private String name;
private String address;
private int number;

public Employee(String name,String address,int number)
{
System.out.println("Constructiong an Employee");
this.name=name;
this.address=address;
this.number=number;
}

public String mailCheck()
{
System.out.println("Mailing a check to" + this.name);
System.out.println("Mailing a check to" + this.address);
}
public String toString()
{
return name;
}
public int toint()
{
return number;
}
public String getName()
{
return name;
}
public String getAddress()
{
return address;
}
}
public class AbstractDemo
{
public static void main(String args[])
{
Employee e=new Employee("N Modi","New Delhi",60);
System.out.println("Call mailCheck using Employee reference");
e.mailCheck();
}
}


































