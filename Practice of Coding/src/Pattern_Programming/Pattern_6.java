package Pattern_Programming;

public class Pattern_6 
{
	public static void main(String[] args) 
	{
		int f=5;
		int n=1;
		
		for(int a=1;a<=f;a++)
		{
			for(int b=1;b<=f;b++)
			{
				System.out.printf("%2d",n);
				n+=2; //variable +2 means every time 2 will be add
			}
			System.out.println();
		}
		
	}

}
