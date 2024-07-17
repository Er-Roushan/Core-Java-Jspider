class NestedLoopProg1_3
{
	public static void main(String []args)
	{
		int i=1;
		do
		{
			char c='A';
			do
			{
				System.out.print(c);
				c++;
			}while(c<='C');

			System.out.println();
			i++;
			
			
		}while(i<=3);
	}
}