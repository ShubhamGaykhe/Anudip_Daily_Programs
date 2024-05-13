package basicConcept;

import java.util.Scanner;

public class IncreamentDecreament 
{
	public static void main(String[] args)
	{
		int num,ans;
		Scanner input=new Scanner(System.in);
		System.out.println("\n\n-*-*-*-* Increament Decreament Opeartor -*-*-*-*");
		
		System.out.println("Enter two number=");
		num=input.nextInt();
		// Accepting input
		
		System.out.println("\n****** Post-Increament ******");
		System.out.println("Before increament , num="+num);
		ans=num++;
		System.out.println("After increament , num="+ans);
		
		System.out.println("****** Post-Decreament ******");
		System.out.println("Before decreament , num="+num);
		ans=num--;
		System.out.println("After decreament , num="+ans);
		
		System.out.println("\n****** Pre-Increament ******");
		num=12;
		System.out.println("Before increament , num="+num);
		ans=++num;
		System.out.println("After increament , num="+ans);
		
		System.out.println("****** Post-Decreament ******");
		num=14;
		System.out.println("Before decreament , num="+num);
		ans=num--;
		System.out.println("After decreament , num="+ans);
		
		input.close();
	}

}
