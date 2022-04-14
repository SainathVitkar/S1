package practice1;

public class Queen extends King
{
	
	public Queen(int a) 
	{
		super(a);
	}
	public void E1()
	{
		System.out.println("Queen class E1 method");
	}
	public void E1(int a)
	{
		System.out.println("Queen class E1 int value "+a);
	}
	protected void E1(String a)
	{
		System.out.println("Queen Class E1 string value "+a);
	}
	final void E1(double a)
	{
		System.out.println("Queen class E1 double value"+a);
	}
	public static void main(String[] args) 
	{
		Queen b=new Queen(10);
		b.E1(100);
		b.E1("Priya");
	}
}
