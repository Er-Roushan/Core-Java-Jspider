class NestedLoopProg12_1
{
	public static void main(String []args)
	{	
		char c='I';
		for (int i=1; i<=3; i++)
		{
			
			for(int j=1; j<=3; j++)
			{				
				System.out.print(c); 
				System.out.print(" "); 
				c--;
				
			}
			
				System.out.println();
		}
	}
}