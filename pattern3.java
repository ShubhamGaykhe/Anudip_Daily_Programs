package basicConcept;

public class pattern3 {

	public static void main(String[] args) {
		int i,j,k;
		for( i=1;i<=6;i++)
		{
			for( j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=6-i;k++)
			{
				if(k%2!=0)
					System.out.print(1);
				else
					System.out.print(0);
			}
			System.out.println();
		}

	}

}
