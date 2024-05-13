package basicConcept;
import java.util.Scanner;
public class ForLoop 
{
	public static void main(String[] args) 
	{
		int num,i;
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter number=");
			num=input.nextInt(); //Accepting number
			for(i=1;i<=10;i++)
			{
				System.out.println(num+"*"+i+"="+(num*i));// Display table
			}
			input.close();
		}
	}
}