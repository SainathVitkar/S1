package practice1;

public class Variable1 
{
	public static void main(String[] args) 
	{
		int a=25,fact=1;
		
		for(int b=1;b<=a;b++)
		{
			fact=fact*b;
		}
		System.out.println("factorial of "+a+" is ="+fact);
	}

}
