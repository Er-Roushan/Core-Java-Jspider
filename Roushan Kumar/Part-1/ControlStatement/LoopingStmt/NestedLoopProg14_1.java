class NestedLoopProg14_1
{
	public static void main(String []args)
	{	
		
		for (int i=1; i<=2; i++)
		{
			char c='A';
			for(int j=1; j<=3; j++)
			{				
				System.out.print(c); 
				System.out.print(" "); 
				c+=2;
				
			}
			
				System.out.println();
		}
	}
}