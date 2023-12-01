package com.basicConcept;
import java.util.*;
public class ArrayOperation 
{
	public static int size,i,j,temp,num[],min,max;
	public static void Accept() // Function definition
	{
		System.out.println("Accepting Array values\n");
		Scanner input=new Scanner(System.in);
		System.out.println("Enter array size=");
		size=input.nextInt();
		num=new int[size];
		System.out.println("Enter array element");
		for(i=0;i<size;i++)
		{
			num[i]=input.nextInt();
		}
	}
	public static void Minimum()  // Function definition
	{
		Accept();
		System.out.println("Minimum from Arrray");
		min=num[0];
		for(i=0;i<size;i++)
		{
			if(min>num[i])
			{
				min=num[i];
			}
		}
		System.out.println("Minimum element="+min);
	}
	public static void Maximum()  // Function definition
	{
		Accept();
		System.out.println("Maximum from Arrray\n");
		max=num[0];
		for(i=0;i<size;i++)
		{
			if(max<num[i])
			{
				max=num[i];
			}
		}
		System.out.println("Maximum element="+max);
	}
	public static void Ascending()  // Function definition
	{
		Accept();
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(num[i]>num[j])
				{
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println("Array in Ascending order\n");
		for(i=0;i<size;i++)  // Display array in ascending order
		{
			System.out.println(num[i]);
		}
	}
	public static void Descending()   // Function definition
	{
		Accept();
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(num[i]<num[j])
				{
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println("Array in Descending order\n");
		for(i=0;i<size;i++)  // Display array in descending order
		{
			System.out.println(num[i]);
		}
	}
	public static void main(String[] args)
	{
		// Function calling
		Minimum();
		Maximum();
		Ascending();
		Descending();
	}
}
