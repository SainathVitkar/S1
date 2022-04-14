package practice;

public class C1 
{
	public void P()
	{
		int a=20;
		System.out.println("C1 Class A="+a);
		double b=15.4;
		System.out.println("C1 Class B="+b);
		double c=a-b;
		System.out.println("C1 Class double value="+c+"____");
	}

	public static void main(String[] args) 
	{
		System.out.println("C1 start from int");
		C1 c1=new C1();
		c1.P();
		System.out.println("C1 ends with double");

	}

}
