package basicConcept;

import java.util.Scanner;

public class whileLoop {

	public static void main(String[] args) {
		int startPoint,endPoint;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter start point");
		startPoint=input.nextInt();
		System.out.println("Enter end point");
		endPoint=input.nextInt();
		while(startPoint<=endPoint)
		{
			System.out.println(startPoint++);
		}
		input.close();

	}

}
