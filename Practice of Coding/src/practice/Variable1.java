package practice;

public class Variable1 
{
	static int b=10;
	int a=20;
	
	public void k1()
	{
		int c=a+b;
	}
	public void k2()
	{
		int d=a*b;
	}

	public static void main(String[] args) 
	{
		Variable1 c=new Variable1();
		System.out.println(b+" "+c.a);
	}

}
