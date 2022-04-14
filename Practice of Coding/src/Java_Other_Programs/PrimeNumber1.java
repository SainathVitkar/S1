package Java_Other_Programs;

public class PrimeNumber1 
{
public static void main(String[] args) 
{
int a=5,c=8,count=0;

for(int b=1;b<=100;b++)
{
	if(a%b==0)
	{
		count++;
	}
}
	if(count==2)
	{
		System.out.println(a+"is a prime number");
	}
	else
	{
		System.out.println(c+"is not a prime number");
	}
}
}
