class NestedLoopProg9_3
{
	public static void main(String []args)
	{
		char i='P';
		do
		{
			int c=1;
			do
			{
				System.out.print(i);
				System.out.print(" ");
				c++;
			}while(c<=3);

			System.out.println();
			i--;
			
			
		}while(i>='M');
	}
}