package IMP_PROGRAM;

public class NaturalNumber1 
{

	public static void main(String[] args) 
	{
		
				int N = 10;
				int sum = 0;
				System.out.print("First " + N + " Numbers = ");
				
				for (int a = 1; a <= N; a++) 
				{
					System.out.print(a + " ");//this is for Natual value code
					sum += a;   //this is for sum of the natural value code
				}
				System.out.println();
				System.out.println("Sum of first " + N + " Natural Number = " + sum);
			
		}


}
