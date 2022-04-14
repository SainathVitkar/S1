package IMP_PROGRAM;

public class SwapWithVariable1 
{
	public static void main(String[] args) 
	{	
		int x,y,z;
		System.out.println("Enter the value of X and Y");
		
		x=11;
		y=12;
		
		System.out.println("before swapping numbers: "+x +"  "+ y);
		
		z=x; 
		x=y; 
		y=z;
		
		System.out.println("After swapping: "+x+"   "+y);  
	    
		System.out.println( );  
		
	}

}
