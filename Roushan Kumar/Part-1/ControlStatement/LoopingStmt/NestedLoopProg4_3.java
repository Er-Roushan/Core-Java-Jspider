class NestedLoopProg4_3
{
	public static void main(String []args)
	{
		int i=1;
		do
		{
			char c='Z';
			do
			{
				System.out.print(c);
				c--;
			}while(c>='W');

			System.out.println();
			i++;
			
			
		}while(i<=3);
	}
}