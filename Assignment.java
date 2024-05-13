package basicConcept;
import java.util.Scanner;
public class Assignment 
{
	public static void main(String[] args) 
	{
		int num1,num2;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter two number=");
		num1=input.nextInt();
		num2=input.nextInt();
		// Accepting input
		
		System.out.println("\n\n-*-*-*-* Assignment Opeartor -*-*-*-*");
		System.out.print("'num1' is assign with 10 value");
		num1+=20;
		System.out.print("\n'num1' is add with 20 and again assign to 'num1'"
				+ " the value="+num1);
		
		System.out.print("\n'num2' is assign with value");
		num2*=2;
		System.out.print("\n'num2' is multiply with 2 and again assign to 'num2'"
				+ " the value="+num2);
		
		input.close();
	}
}
