class NestedLoopProg13_1
{
	public static void main(String []args)
	{	
		int a=9;
		for (int i=1; i<=3; i++)
		{
			
			for(int j=1; j<=3; j++)
			{				
				System.out.print(a); 
				System.out.print(" "); 
				a--;
				
			}
			
				System.out.println();
		}
	}
}