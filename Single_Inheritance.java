package Inheritance;
import java.util.*;
class Programmers
{
	int num1,num2,num3;
	Scanner input=new Scanner(System.in);
	public void gretest()
	{
		System.out.println("Enter the three number=");
		num1=input.nextInt();
		num2=input.nextInt();
		num3=input.nextInt();
		if(num1>=num2 && num1>=num3)
			System.out.println(num1+" is gretest");
		if(num2>=num1 && num2>=num3)
			System.out.println(num2+" is gretest");
		else
			System.out.println(num3+" is gretest");
	}
}

class Employee extends Programmers
{
	String name,dept,dest;
	double salary;
	public void accept()
	{
		gretest();
		System.out.print("Enter name of the employee=");
		name=input.next();
		System.out.print("Enter department of the employee=");
		dept=input.next();
		System.out.print("Enter destination of the employee=");
		dest=input.next();
		System.out.print("Enter salary of the employee=");
		salary=input.nextDouble();
		display();
	}
	public void display()
	{
		System.out.println("Name="+name);
		System.out.println("Department="+dept);
		System.out.println("Destination="+dest);
		System.out.println("Salary="+salary);
	}
}

public class Single_Inheritance 
{
	public static void main(String[] args) 
	{
		Employee obj=new Employee();
		obj.accept();
	}
}
