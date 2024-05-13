package basicConcept;

import java.util.Scanner;

public class MultipleChoice 
{

	public static void main(String[] args) 
	{
		int choice,num1,num2,num3;
		char vowel;
		Scanner input=new Scanner(System.in);
		System.out.println("!!!!! MENU !!!!!");
		System.out.println("1) Find the gretest between 3 number\n"
				+ "2) Even or Odd\n"
				+ "3) Charecter is vowel or not\n"
				+ "4) Divisible by or not\n"
				+ "Enter your choice=");
		choice=input.nextInt();
		switch(choice)
		{
			case 1:
				System.out.print("Enter three number=");
				num1=input.nextInt();
				num2=input.nextInt();
				num3=input.nextInt();
				// Accepting input
				
				if(num1>=num2 && num1>=num3) //comparing num1 , num2and num3
					System.out.println(num1+" is gretest number");
				
				else if(num2>=num1 && num2>=num3) //comparing num1 , num2and num3
					System.out.println(num2+" is gretest number");
				
				else if(num3>=num1 && num3>=num2) //comparing num1 , num2and num3
					System.out.println(num3+" is gretest number");
				break;
				
			case 2:
				System.out.print("Enter a number=");
				num1=input.nextInt();
				// Accepting input
				
				if(num1%2==0)
					System.out.println(num1+" is even number");
				else
					System.out.println(num1+" is even number");
				break;
				
			case 3:
				System.out.print("Enter a character=");
				vowel=input.next().charAt(0); //Use CharAt() method
				if (vowel=='a'|| vowel=='e'|| vowel=='i'|| vowel=='o'|| vowel=='u'|| vowel=='A'|| vowel=='E'|| vowel=='I'|| vowel=='O'|| vowel=='U') //comparing vowels
					System.out.println(vowel+" is vowel");
				else
					System.out.println(vowel+" is not vowel");
				break;
				
			case 4:
				System.out.print("Enter a number=");
				num1=input.nextInt();
				// Accepting input
				
				if(num1%5==0) 
					System.out.println(num1+" is divisible by 5");
				else
					System.out.println(num1+" is not divisible by 5");
				break;
		}
		input.close();
	}
}
