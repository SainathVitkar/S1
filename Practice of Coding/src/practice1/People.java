package practice1;

public class People extends Queen
{
	public People(int a) 
	{
		super(a);
		System.out.println("People class constructor "+a);
	}

	static int a=100;
	static
	{
		System.out.println("Static method"+a);
		
	}
	{
		System.out.println("Non static method"+a);
	}
	
	public static void main(String[] args) 
	{
		People p=new People(10);
		p.E1(10.5);
		p.E1(10);
		p.E1("Priya");
		p.E1(10.5);
	
		
		
		
	}

}
