class Salary extends Employee
{
private double Salary;

public Salary(String name,String address,int number,double salary)

{
Super(name,address,number)
setSalary(Salary);
}
public void mailCheck()
{
System.out.println("within mail check of salary class");
System.out.println("mail checking to"+getname()+"with salary"+Salary);
}
public double getSalary()
{
return Salary;
}
public void setSalary(double new Salary)
{
if(newSalary>=0.0)
{
Salary=new Salary;
}
}
public double ComputePay()
{
System.out.println("compute salary pay for"+getname());
return Salary/50;
}
}













