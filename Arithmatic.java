package basicConcept;
import java.util.Scanner;
public class Arithmatic
{
	public static void main(String[] args) 
	{
		int num1,num2;
		Scanner input=new Scanner(System.in);
		//Performing arithmetic operation
		
		System.out.println("Enter two number=");
		num1=input.nextInt();
		num2=input.nextInt();
		// Accepting input
		
		System.out.println("-*-*-*-* Arithmatic Operator -*-*-*-*");
		System.out.println("******** ADDITION ********");
		System.out.print("Addition="+(num1+num2)); //Addition
		
		System.out.println("\n******** SUBSTRACTION ********");
		System.out.print("Substraction="+(num2-num1)); //Substraction
		
		System.out.println("\n******** MULTIPLICATION ********");
		System.out.print("Multiplication="+(num2*num1)); //Multiplication
		 
		System.out.println("\n******** DIVISIION ********");
		System.out.print("Division="+(num2/num1)); // Division
		
		input.close();

	}

}
