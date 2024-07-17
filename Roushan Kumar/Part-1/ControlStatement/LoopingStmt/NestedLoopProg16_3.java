class NestedLoopProg16_3
{
	public static void main(String []args)
	{
		
		int i=1;
		do
		{
			
			int c=1;
			do
			{
				System.out.print(c%2);
				System.out.print(" ");
				
				c++;
			}while(c<=4);

			System.out.println();
			i++;
			
			
		}while(i<=3);
	}
}