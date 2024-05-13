package basicConcept;
import java.util.*;
public class HotelMenuCard 
{
	public static void main(String[] args) 
	{
		int choice,choice1=0,bill=0,quantity=0,i=0;
		String[] item_name=new String[20];
		int[] item_quantity=new int[20];
		int[] amount=new int[20];
		char answer =' ',answer1=' ';
		
		Scanner input=new Scanner(System.in);
		System.out.println("***** Welcome to SHUBHAM'S Hotel ******\n");
		do
		{
			System.out.println("-*-*-* MENU -*-*-*\n"  // display main menu
					+ "1: Starters \n"
					+ "2: Soup \n"
					+ "3: Toast \n"
					+ "4: Cold Drinks \n"
					+ "Enter your choice=");
			choice=input.nextInt();
			
			switch(choice)
			{
				case 1:
					do
					{
						System.out.print("-=-=-= Select Starters -=-=-=\n" // display sub menu
								+ "1) Onion Bhaji \t\t 80Rs\n"
								+ "2) Plain Chips \t\t 65Rs\n"
								+ "3) Masala Chips \t 70Rs\n"
								+ "Enter your choice=");
						choice1=input.nextInt();
						
						switch(choice1)
						{
							case 1:
								System.out.print("Enter quantity of Onion Bhaji plates:");
								quantity=input.nextInt();
								//calculate the bill with ordered
								bill+=80*quantity;
								item_name[i]="Onion Bhaji \t\t 80Rs";
								item_quantity[i]=quantity;
								amount[i]=80*quantity;
								i++;
								break;
								
							case 2:
								System.out.print("Enter quantity of Plain Chips plates:");
								quantity=input.nextInt();
								bill+=65*quantity;
								item_name[i]="Plain Chips \t\t 65Rs";
								item_quantity[i]=quantity;
								amount[i]=56*quantity;
								i++;
								break;
								
							case 3:
								System.out.print("Enter quantity of Masala Chips plates:");
								quantity=input.nextInt();
								bill+=70*quantity;
								item_name[i]="Masala Chips \t\t 70Rs";
								item_quantity[i]=quantity;
								amount[i]=70*quantity;
								i++;
								break;
								
							default:
								System.out.println("Select Proper Menu\n");
						}
						System.out.print(">>>>>>>> Have more order with Starters (Y/N):");
						answer1=input.next().charAt(0);
						
					}while(answer1=='Y' || answer1=='y');
					break;
					
				case 2:
					do
					{
						System.out.println("-=-=-= Select Soup -=-=-=\n" // display sub menu
								+ "1) Manchow Soup \t 130Rs\n"
								+ "2) Sweet Corn Soup \t 130Rs\n"
								+ "3) Ginger \t\t 80Rs\n"
								+ "4) Sour Soup \t\t 120Rs\n"
								+ "Enter your choice=");
						choice1=input.nextInt();
						
						switch(choice1)
						{
							case 1:
								System.out.print("Enter quantity of Manchow Sou bowl:");
								quantity=input.nextInt();
								//calculate the bill with ordered
								bill+=130*quantity;
								item_name[i]="Manchow Sou \t\t 130Rs";
								item_quantity[i]=quantity;
								amount[i]=130*quantity;
								i++;
								break;
								
							case 2:
								System.out.print("Enter quantity of Sweet Corn Soup bowl:");
								quantity=input.nextInt();
								bill+=130*quantity;
								item_name[i]="Sweet Corn Soup \t 130Rs";
								item_quantity[i]=quantity;
								amount[i]=130*quantity;
								i++;
								break;
								
							case 3:
								System.out.print("Enter quantity of Ginger bowl:");
								quantity=input.nextInt();
								//calculate the bill with ordered
								bill+=80*quantity;
								item_name[i]="Ginger \t\t 80Rs";
								item_quantity[i]=quantity;
								amount[i]=80*quantity;
								i++;
								break;
								
							case 4:
								System.out.print("Enter quantity of Sour Soup bowl:");
								quantity=input.nextInt();
								bill+=120*quantity;
								item_name[i]="Ginger \t\t 120Rs";
								item_quantity[i]=quantity;
								amount[i]=120*quantity;
								i++;
								break;
								
							default:
								System.out.println("Select Proper Menu\n");
						}
						System.out.print(">>>>>>>> Have more order with Soup (Y/N):");
						answer1=input.next().charAt(0);
						
					}while(answer1=='Y' || answer1=='y');
					break;
					
				case 3:
					do
					{
						System.out.println("-=-=-= Select Toast -=-=-=\n" // display sub menu
								+ "1) Plane Toast(4 pcs) \t\t 50Rs\n"
								+ "2) Honey Toast(4 pcs) \t\t 70Rs\n"
								+ "3) Paneer Toast(4 pcs) \t\t 140Rs\n"
								+ "Enter your choice=");
						choice1=input.nextInt();
						
						switch(choice1)
						{
							case 1:
								System.out.print("Enter quantity of Plane Toast plates:");
								quantity=input.nextInt();
								//calculate the bill with ordered
								bill+=50*quantity;
								item_name[i]="Plane Toast \t\t 50Rs";
								item_quantity[i]=quantity;
								amount[i]=50*quantity;
								i++;
								break;
								
							case 2:
								System.out.print("Enter quantity of Honey Toast plates:");
								quantity=input.nextInt();
								bill+=70*quantity;
								item_name[i]="Honey Toast \t\t 70Rs";
								item_quantity[i]=quantity;
								amount[i]=70*quantity;
								i++;
								break;
								
							case 3:
								System.out.print("Enter quantity of Paneer Toast plates:");
								quantity=input.nextInt();
								//calculate the bill with ordered
								bill+=140*quantity;
								item_name[i]="Paneer Toast \t\t 140Rs";
								item_quantity[i]=quantity;
								amount[i]=140*quantity;
								i++;
								break;
								
							default:
								System.out.println("Select Proper Menu\n");
						}
						System.out.print(">>>>>>>> Have more order with Toast (Y/N):");
						answer1=input.next().charAt(0);
						
					}while(answer1=='Y' || answer1=='y');
					break;
					
				case 4:
					do
					{
						System.out.println("-=-=-= Select Cold Drinks -=-=-=\n" // display sub menu
								+ "1) Banana Lassi \t 60Rs\n"
								+ "2) Cold Coffee \t\t 60Rs\n"
								+ "3) Nimbu Pani \t\t 30Rs\n"
								+ "4) Mango Shake \t\t 70Rs \n"
								+ "5) Chocalate Shake \t 80Rs \n"
								+ "Enter your choice=");
						choice1=input.nextInt();
						
						switch(choice1)
						{
							case 1:
								System.out.print("Enter quantity of Banana Lassi glass:");
								quantity=input.nextInt();
								bill+=60*quantity;
								item_name[i]="Banana Lassi \t\t 60Rs";
								item_quantity[i]=quantity;
								amount[i]=60*quantity;
								i++;
								break;
								
							case 2:
								System.out.print("Enter quantity of Cold Coffee glass:");
								quantity=input.nextInt();
								//calculate the bill with ordered
								bill+=60*quantity;
								item_name[i]="Cold Coffee \t\t 60Rs";
								item_quantity[i]=quantity;
								amount[i]=60*quantity;
								i++;
								break;
								
							case 3:
								System.out.print("Enter quantity of Nimbu Pani glass:");
								quantity=input.nextInt();
								bill+=30*quantity;
								item_name[i]="Nimbu Pani \t\t 30Rs";
								item_quantity[i]=quantity;
								amount[i]=30*quantity;
								i++;
								break;
								
							case 4:
								System.out.print("Enter quantity of Mango Shake glass:");
								quantity=input.nextInt();
								bill+=70*quantity;
								item_name[i]="Mango Shake \t\t 70Rs";
								item_quantity[i]=quantity;
								amount[i]=70*quantity;
								i++;
								break;
								
							case 5:
								System.out.print("Enter quantity of Chocalate Shake glass:");
								quantity=input.nextInt();
								//calculate the bill with ordered
								bill+=80*quantity;
								item_name[i]="Chocalate Shake \t 80Rs";
								item_quantity[i]=quantity;
								amount[i]=80*quantity;
								i++;
								break;
								
							default:
								System.out.println("Select Proper Menu\n");
						}
						System.out.print(">>>>>>>> Have more order with Cold Drinks (Y/N):");
						answer1=input.next().charAt(0);
						
					}while(answer1=='Y' || answer1=='y');
					break;
					
				default:
					System.out.println("Select Proper Menu\n");
			}
			
			System.out.print("<<<<<<<< Do you have more order (Y/N):");
			answer=input.next().charAt(0);
			
			//Printing the bill
		}while(answer=='Y' || answer=='y');
		
		System.out.println("\t\t=*=*=*=*=*=*=*=* Your BILL =*=*=*=*=*=*=*=*");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("Sr.No \t\t "
				+ "Item Name \t\t "
				+ "Rate \t\t "
				+ "Quantity \t\t"
				+ "Amount \n");
		System.out.println("--------------------------------------------------------------------------------------");
		
		for(int j=0;j<i;j++)
		{
			System.out.println(+(j+1) +"\t\t "+item_name[j]+"\t\t "+item_quantity[j]+"\t\t\t"+amount[j]+"Rs"); // Printing bill
		}
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("\n\t\t Total amount \t\t\t\t\t\t\t"+bill+"Rs");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("Thank you for coming \n Have a Good Day");
		input.close();
	}
}