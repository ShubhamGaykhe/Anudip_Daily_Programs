package basicConcept;
import java.util.Scanner;
public class Comparission 
{
	public static void main(String[] args) 
	{
		int num1,num2;
		Scanner input=new Scanner(System.in);
		System.out.println("\n\n-*-*-*-* Comparission Operator -*-*-*-*");
		System.out.println("Enter two number=");
		num1=input.nextInt();
		num2=input.nextInt();
		// Accepting input
		
		System.out.println("num1="+num1+"\nnum2="+num2);
		
		System.out.println("Result of (num1>num2)="+(num1>num2));
		
		System.out.println("Result of (num1>=num2)="+(num1>=num2));
		
		System.out.println("Result of (num1<num2)="+(num1<num2));
		
		System.out.println("Result of (num1!=num2)="+(num1!=num2));
		
		input.close();
		
	}

}
