class NestedLoopProg8_3
{
	public static void main(String []args)
	{
		int i=1;
		do
		{
			int c=1;
			do
			{
				System.out.print(i);
				c++;
			}while(c<=3);

			System.out.println();
			i++;
			
			
		}while(i<=3);
	}
}