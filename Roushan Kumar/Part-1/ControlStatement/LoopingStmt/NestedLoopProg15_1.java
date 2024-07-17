class NestedLoopProg15_1
{
	public static void main(String []args)
	{	
		
		for (int i=1; i<=3; i++)
		{
			int a=3;
			for(int j=1; j<=3; j++)
			{				
				System.out.print(a); 
				System.out.print(" "); 
				a*=3;
				
			}
			
				System.out.println();
		}
	}
}