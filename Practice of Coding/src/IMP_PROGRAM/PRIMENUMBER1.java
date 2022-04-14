package IMP_PROGRAM;

public class PRIMENUMBER1 
{
	public static void main(String[] args) 
	{
		int a=7, b=8, count=0; //variable taken
		
		for(int c=1;c<=a;c++)
		{
			if(a%c==0)
			{
				count++; // increment
			}
		}
		if(count==2) //exactly 2 if no.is prime
		{
			System.out.println(a+" Its prime number");
		}
		else 
		{
			System.out.println(b+" Its not prime number");
		}		
	}

}
