package basicConcept;
import java.util.Scanner;
public class Logical 
{
	public static void main(String[] args) 
	{

		int num1,num2;
		boolean result;
		Scanner input=new Scanner(System.in);
		// Performing logical operation
		
		System.out.println("Enter two number=");
		num1=input.nextInt();
		num2=input.nextInt();
		// Accepting input
		
		System.out.println("num1="+num1+"\nnum2="+num2);
		
		//logical and(&)
		result=(num1>num2)&&(num1<num2);
		System.out.println("Result of (num1>num2)&&(num1<num2)="+result);
		
		result=(num1<num2)&&(num1<=num2);
		System.out.println("Result of (num1<num2)&&(num1<=num2)="+result);
		
		//logical or(|)
		result=(num1>num2)||(num1<=num2);
		System.out.println("Result of (num1>num2)||(num1<=num2)="+result);
		
		result=(num1<num2)||(num1<=num2);
		System.out.println("Result of (num1<num2)||(num1<=num2)="+result);
		
		//logical not(!)
		result=!((num1<num2)||(num1<=num2));
		System.out.println("Result of !((num1<num2)||(num1<=num2))="+result);

		input.close();
	}
}
