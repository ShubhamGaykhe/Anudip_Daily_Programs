package com.Daily_Programs;
import java.util.*;
public class MenuDriven {
	public int accept()
	{
		int choice;
		Scanner input=new Scanner(System.in);
		System.out.println("\n>>>>>>>>>>> MENU <<<<<<<<<<<\n" // Display menu
				+ "\n1) Sum of Digit\n"
				+ "2) Prime Number\n"
				+ "3) Fibonacci series\n"
				+ "4) Exit\n"
				+ "Enter your choice=");
		choice=input.nextInt();
		switch(choice)
		{
			case 1:
				int num;
				System.out.print("Enter number=");
				num=input.nextInt();
				SumOfDigit(num);
				break;
				
			case 2:
				System.out.print("Enter number=");
				num=input.nextInt();
				Prime(num);
				break;
				
			case 3:
				System.out.print("Enter lenght of series=");
				num=input.nextInt();
				fibonacci(num);
				break;
		}
		return choice;
	}
	public void SumOfDigit(int num)  // Sum of digit function
	{
		int sum=0,lastDigit;
		while(num!=0)
		{
			lastDigit=num%10;
			sum+=lastDigit;
			num/=10;
		}
		System.out.println("Sum of digit="+sum);
	}
	public void Prime(int num) // Prime number function
	{
		int i;
		boolean flag=true;
		for(i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println("Number is prime");
		else
			System.out.println("Number is not prime");
	}
	public void fibonacci(int num) // Fibonacci series function
	{
		int first=0,second=1,next,i;
		System.out.print(first+" "+second+" ");
		for(i=2;i<num;i++)
		{
			next=first+second;
			first=second;
			second=next;
			System.out.print(next+" ");
		}
	}
	public static void main(String[] args) 
	{
		MenuDriven obj=new MenuDriven(); // Object creation
		int value;
		do
		{
			value=obj.accept();
		}while(value!=4);
	}
}
