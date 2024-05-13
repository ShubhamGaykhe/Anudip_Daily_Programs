package basicConcept;
import java.util.Scanner;
public class Rate_Of_Interest 
{
	public static void main(String[] args) 
	{
		char gender;
		int age;
		Scanner input=new Scanner(System.in);
		
		//Accepting input from user
		System.out.print("Enter the gender=");
		gender=input.next().charAt(0); //Use CharAt() method
		System.out.print("Enter age=");
		age=input.nextInt();
		if(age>60)
		{
			if(gender=='F'|| gender=='f') // Check gender
				System.out.println("The rate of interest is 7.5%");
			
			else if(gender=='M'|| gender=='m') // Check gender
				System.out.println("The rate of interest is 7");
			
			else
				System.out.println("Enter proper gender");
		}
		
		else if(age<60)
		{
			if(gender=='F'|| gender=='f' || gender=='M'|| gender=='m') // Check gender both male and female
				System.out.println("The rate of interest is 5%");
			
			else
				System.out.println("Enter proper gender");
			
		}
		else
			System.out.println("No rate of interst ");
		input.close();
	}
}