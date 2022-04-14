package practice;

public class If1 
{

	public static void main(String[] args) 
	{
		int a=100;
		
		if(a%2==0)
		{
		System.out.println("Even number");	
		}
		else
		{
			System.out.println("Odd Number");
		}

	if(a%15==0)
	{
		System.out.println("Even number");			
	}
	else
	{
		System.out.println("Odd Number");
	}
	
	while(a>8)
		{
			System.out.println("While");
			
			System.out.println("previour"+a);
			a--;
			System.out.println("new"+a);
		}


}
}