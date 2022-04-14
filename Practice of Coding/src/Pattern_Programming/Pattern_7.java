package Pattern_Programming;

public class Pattern_7 
{
	public static void main(String[] args) 
	{
		int u=5;
		int i=2;
		
		for(int a=1;a<=u;a++)
		{
			for(int b=1;b<=u;b++)
			{
				System.out.printf("%6d",i);
				i+=2;
			}
			System.out.println();
		}
	}
}
