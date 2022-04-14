package practice1;

public class C extends B
{
	public void k1(int c)
	{
		super.k1(c);
		System.out.println("C class "+c);
	}
	public static void main(String[] args) 
	{
		C c=new C();
		c.k1(10);
	}

}
