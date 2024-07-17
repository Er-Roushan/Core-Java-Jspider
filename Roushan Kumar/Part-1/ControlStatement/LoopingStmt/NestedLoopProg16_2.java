class NestedLoopProg16_2
{
	public static void main(String []args)
	{
		
		int i=1;
		while(i<=3)
		{	
			int j=1;
			while(j<=4)
			{
				System.out.print(j%2);
				System.out.print(" ");
				
				j++;
			}
			System.out.println();
			i++;
		}
	}
}