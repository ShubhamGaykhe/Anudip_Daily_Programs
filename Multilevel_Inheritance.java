package Anudip_Daily_Programs;
import java.util.*;
class Bank	// parent class
{
	int balance=0,amount,temp=0;
	Scanner input=new Scanner(System.in);
	public void totalBalance() // Display total bank balance
	{
		if(temp!=0) 
			System.out.println("Your bank balance="+balance);
		else
			System.out.println("First create the bank account\n");
	}
	public void deposite()  // function for deposit money in bank account
	{
		if(temp!=0)
		{
			System.out.print("Enter amount for deposite=");
			amount=input.nextInt();				
			balance+=amount;
		}
		else
			System.out.println("First create the bank account\n");
	}
	public void withdraw()// function for withdraw money in bank account
	{
		if(temp!=0)
		{
			System.out.print("Enter amount for withdraw=");
			amount=input.nextInt();
			if(amount>balance)
				System.out.println("Your account have only "+balance+" Rs");
			else
				balance-=amount;
		}
		else
			System.out.println("First create the bank account\n");
	}
}

class BankStaff extends Bank  // Bank is parent class and 
								// BankStaff is child of Bank class
{
	String name,mail,Pan_no;
	int acc_type,Aadhar_no,age,phone_no;
	public void account_Creation() // Accepting bank holder details
	{
		temp=1;
		System.out.print("Enter name=");
		name=input.next();
		System.out.print("Enter mail=");
		mail=input.next();
		System.out.print("Enter aadhar no.=");
		Aadhar_no=input.nextInt();
		System.out.print("Enter PAN no.=");
		Pan_no=input.next();
		System.out.print("Enter Phone no.=");
		phone_no=input.nextInt();
		System.out.print("Enter age=");
		age=input.nextInt();
		System.out.print("1) Saving\n"
				+ "2) Current\n"
				+ "Enter Account type=");
		acc_type=input.nextInt();
		if(acc_type==2)
		{
			System.out.print("Enter amount for account creation=");
			balance=input.nextInt();
		}
		System.out.print(">>>>>>>>>> Account has been created sucessfully >>>>>>>>\n");
	}
	public void display() // Display bank holder details 
						// But not display private information
	{
		if(temp!=0)
		{
			System.out.println("Name="+name);
			System.out.println("Mail="+mail);
			System.out.println("Phone no.="+phone_no);
			if(acc_type==2)
				System.out.println("Account type=current");
			else
				System.out.println("Account type=saving");
			
		}	
		else
			System.out.println("First create the bank account\n");
	}
}

class AccountHolder extends BankStaff 	// BankStaff is parent class and 
										//AccountHolder is child of BankStaff class
{
	public void select()
	{
		int choice;
		do
		{
			System.out.println("1) Create account\n"
					+ "2) Show custmor details\n"
					+ "3) show bank balance\n"
					+ "4) Deposite amount\n"
					+ "5) Withdraw amount\n"
					+ "6) Exit\n"
					+ "Enter your choice=");
			choice=input.nextInt();
			switch(choice)
			{
				case 1:
					account_Creation();
					break;
					
				case 2:
					display();
					break;

				case 3:
					totalBalance();
					break;
					
				case 4:
					deposite();
					break;
					
				case 5:
					withdraw();
					break;
					
				case 6:
					System.exit(0);
					break;
			}
		}while(true);
	}
}

public class Multilevel_Inheritance 
{
	public static void main(String[] args) 
	{
		AccountHolder obj=new AccountHolder();  // child object creation
		obj.select();
	}
}