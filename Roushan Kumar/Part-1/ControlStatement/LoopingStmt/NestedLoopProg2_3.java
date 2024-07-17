class NestedLoopProg2_3
{
	public static void main(String []args)
	{
		int i=1;
		do
		{
			char c='C';
			do
			{
				System.out.print(c);
				c++;
			}while(c<='F');

			System.out.println();
			i++;
			
			
		}while(i<=2);
	}
}