package Strings;

import java.util.Scanner;

public class StringFunction 
{
	public void cases()
	{
		StringFunctionCall obj=new StringFunctionCall();
		Scanner input=new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("<<<<<< JAVA In-Build Methods >>>>>\n"
					+ "1) CharAt()\t\t\t2) CompareTO()\n"
					+ "3) CompareToIgnoreCase()\t4) ConCat()\n"
					+ "5) Contain()\t\t\t6) EndsWith()\n"
					+ "7) StrartWith()\t\t\t8) Equals()\n"
					+ "9) EqualsIgnoreCase()\t\t10) IsEmpty()\n"
					+ "11) Length()\t\t\t12) ToLower()\n"
					+ "13) ToUpper()\t\t\t14) IndexOf()\n"
					+ "15) Trim()\t\t\t16) Exit\n"
					+ "Enter your choice=");
			choice=input.nextInt();
			switch(choice)
			{
				case 1:
					obj.CharAt();
					break;
				case 2:
					obj.CompareTO();
					break;
				case 3:
					obj.CompareToIgnoreCase();
					break;
				case 4:
					obj.ConCat();
					break;
				case 5:
					obj.Contain();
					break;
				case 6:
					obj.EndsWith();
					break;
				case 7:
					obj.StrartWith();
					break;
				case 8:
					obj.Equals();
					break;
				case 9:
					obj.EqualsIgnoreCase();
					break;
				case 10:
					obj.IsEmpty();
					break;
				case 11:
					obj.Length();
					break;
				case 12:
					obj.ToLower();
					break;
				case 13:
					obj.ToUpper();
					break;
				case 14:
					obj.IndexOf();
					break;
				case 15:
					obj.Trim();
					break;
				case 16:
					System.exit(0);
					break; 
			}
		}while(true);
	}
	public static void main(String[] args) 
	{
		StringFunction obj1=new StringFunction();
		obj1.cases();
	}
}