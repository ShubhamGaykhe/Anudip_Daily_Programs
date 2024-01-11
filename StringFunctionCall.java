package Strings;

import java.util.Scanner;

public class StringFunctionCall 
{
	Scanner input=new Scanner(System.in);
	String name,name1;
	int index;
	public void CharAt()
	{
		System.out.println("\n---- chaAt()----");
		System.out.print("Enter the name=");
		name=input.nextLine();
		System.out.print("Enter index=");
		index=input.nextInt();
		System.out.println(index+" index character="+name.charAt(index));
	}
	
	public void CompareTO()
	{
		System.out.println("\n---- comapreTo()----");
		System.out.print("Enter first name=");
		name=input.nextLine();
		System.out.print("Enter second name=");
		name1=input.nextLine();
		if(name.compareTo(name1)==0)
			System.out.println("Two names are equals");
		else
			System.out.println("Two names are not equals");
	}
	
	public void CompareToIgnoreCase()
	{
		System.out.println("\n---- compareToIgnoreCase()----");
		System.out.print("Enter first name=");
		name=input.nextLine();
		System.out.print("Enter second name=");
		name1=input.nextLine();
		if(name.compareToIgnoreCase(name1)==0)
			System.out.println("Two name are equals");
		else
			System.out.println("Two name are not equals");
	}
	public void ConCat()
	{
		System.out.println("\n---- concat()----");
		System.out.print("Enter first name=");
		name=input.nextLine();
		System.out.print("Enter second name=");
		name1=input.nextLine();
		System.out.println("Concated name= "+name.concat(name1));
	}
	
	public void Contain()
	{
		System.out.println("\n---- contains()----");
		System.out.print("Enter your address=");
		name=input.nextLine();
		System.out.print("Enter city name=");
		name1=input.nextLine();
		if(name.contains(name1))
			System.out.println("'"+name+"' contain '"+name1+"'");
		else
			System.out.println("'"+name+"' not contain '"+name1+"'");
	}
	
	public void EndsWith()
	{
		System.out.println("\n---- endsWith()----");
		System.out.print("Enter big string=");
		name=input.nextLine();
		System.out.print("Enter small string=");
		name1=input.nextLine();
		if(name.endsWith(name1))
			System.out.println("'"+name+"' is ends with '"+name1+"'");
		else
			System.out.println("'"+name+"' is not ends with '"+name1+"'");
	}
	
	public void StrartWith()
	{
		System.out.println("\n---- startsWith()----");
		System.out.print("Enter big string=");
		name=input.nextLine();
		System.out.print("Enter small string=");
		name1=input.nextLine();
		if(name.startsWith(name1))
			System.out.println("'"+name+"' is start with '"+name1+"'");
		else
			System.out.println("'"+name+"' is not start with '"+name1+"'");
	}
	
	public void Equals()
	{
		System.out.println("\n---- equals()----");
		System.out.print("Enter first name=");
		name=input.nextLine();
		System.out.print("Enter second name=");
		name1=input.nextLine();
		if(name.equals(name1))
			System.out.println(name+" is equal to "+name1);
		else
			System.out.println(name+" is not equal to "+name1);
	}
	
	public void EqualsIgnoreCase()
	{
		System.out.println("\n---- equalsIgnoreCase()----");
		System.out.print("Enter first name=");
		name=input.nextLine();
		System.out.print("Enter second name=");
		name1=input.nextLine();
		if(name.equalsIgnoreCase(name1))
			System.out.println(name+" is equal to "+name1);
		else
			System.out.println(name+" is not equal to "+name1);
	}
	
	public void IsEmpty()
	{
		System.out.println("\n---- isEmpty()----");
		System.out.print("Enter the name=");
		name=input.nextLine();
		if(name.isEmpty())
			System.out.println("Name is empty");
		else
			System.out.println("Name is not empty");
	}
	
	public void Length()
	{
		System.out.println("\n---- length()----");
		System.out.print("Enter the name=");
		name=input.nextLine();
		System.out.println("Length of "+name+" = "+name.length());
	}
	
	public void ToLower()
	{
		System.out.println("\n---- toLowerCase()----");
		System.out.print("Enter the name=");
		name=input.nextLine();
		System.out.println("Name in lower case="+name.toLowerCase());
	}
	
	public void ToUpper()
	{
		System.out.println("\n---- toUpperCase()----");
		System.out.print("Enter the name=");
		name=input.nextLine();
		System.out.println("Name in upper case="+name.toUpperCase());
	}
	
	public void IndexOf()
	{
		System.out.println("\n---- indexOf()----");
		System.out.print("Enter big string=");
		name=input.nextLine();
		System.out.print("Enter small string=");
		name1=input.nextLine();
		System.out.println(name1+" is at the "+name.indexOf(name1)+" Possition");
	}
	
	public void Trim()
	{
		System.out.println("\n---- trim()----");
		System.out.print("Enter the name=");
		name=input.nextLine();
		System.out.println("After removing whitespace the name="+name.trim());
	}
} 