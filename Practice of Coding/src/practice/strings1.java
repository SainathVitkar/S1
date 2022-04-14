package practice;

public class strings1 
{
	public strings1()
	{
		String a="Morya";
		String b="Ganapati";
		String c= "Mory";
		String d="morya";
		
		System.out.println(a.contains(c));
		System.out.println(a.compareTo(b));
		System.out.println(a.equals(d));
		System.out.println(a.equalsIgnoreCase(d));
		
	}
public static void main(String[]args)
{
	strings1 a=new strings1();
}
	
}
