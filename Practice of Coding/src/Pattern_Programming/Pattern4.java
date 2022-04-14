package Pattern_Programming;

public class Pattern4 
{
	public static void main(String[] args) 
	{
		for(int a=1;a<=5;a++)
		{
			System.out.print(a);
		}
		System.out.println();
		int a,b,c=5;
		for(a=0;a<c;a++)
		{
			for(b=c-a;b>1;b--)
			{
				System.out.print("");
			}
			for(b=0;b<=a;b++)
			{
				System.out.print("*");
			}
			System.out.println();
		} //1st for loop closure
	} //main method closure
} //class closure
