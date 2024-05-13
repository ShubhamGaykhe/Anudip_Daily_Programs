package basicConcept;

public class Function 
{
	public static void Table(int num)
	{
		System.out.println();
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*num);
		}
	}
	public static void main(String[] args) 
	{
		for(int i=1;i<=15;i++)
		{
			Table(i);
		}
	}
}