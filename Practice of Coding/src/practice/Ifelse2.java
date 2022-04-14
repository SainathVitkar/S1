package practice;

public class Ifelse2 
{
	int a=100;
	static
	{
		int b=200;
		int c=b/2;
		System.out.println(c);
	}
	Ifelse2(int a)
	{
		if(a%2==0)
		{
			System.out.println("If");
		}
		else
		{
			System.out.println("Else");
		}
		{
			System.out.println("Non static");
		}
	}
	public static void main(String[]args)
	{
		Ifelse2 h=new Ifelse2(10);
	}
}
