package Pattern_Programming;

public class Pattern5 
{
	public static void main(String[] args) 
	{
	
	
		for(int i=1;i<=2;i++) //2 times
		{
			for(int j=1;j<=6;j++) // 6 times
			{
				if(j<=3) //condition for 3 times
				{
				System.out.print("*");
				}
				else
				{
					System.out.println(); //line
					for(int a=1;a<=6;a++) //6 times
					{
						for(int h=1;h<=6;h++) // 6 times
						{
							if(h<=3) // 3 times
							{
							System.out.print(" "); //for space
							}
							else if(h<=6)
							{	
								if(i==2) 
								{
									for(int q=4;q<=6;q++)
									{
										System.out.print(q); //4 to 6
									}
									break;
								}
								else
								{
									System.out.print(a);
									a++;
								}
							
							}
						}
						break;	
					}
					break;
				}
			}
			System.out.println();
		}
	}
}

