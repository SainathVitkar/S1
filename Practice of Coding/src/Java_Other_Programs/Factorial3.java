package Java_Other_Programs;

public class Factorial3 {

	public static void main(String[] args) 
	{
		int b=6,fact=1;
		
		for(int a=1;a<=b;a++)
		{
			fact=fact*a;
		}
		System.out.println("Factorial of "+b+" is:"+fact);
	}

}
