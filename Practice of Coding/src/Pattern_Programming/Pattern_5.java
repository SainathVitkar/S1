package Pattern_Programming;

public class Pattern_5 
{
   public static void main(String[] args) 
   {
	int h=5;
	int j=1;
	
	for(int a=1;a<=h;a++)
	{
		for(int  b=1;b<=h;b++)
		{
			System.out.printf("%2d",j); 
			j++;
		}
		System.out.println();
	}
   }
}
