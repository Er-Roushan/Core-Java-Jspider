class NestedLoopProg12_3
{
	public static void main(String []args)
	{
		char val='I';
		int i=1;
		do
		{
			
			int c=1;
			do
			{
				System.out.print(val);
				System.out.print(" ");
				val--;
				c++;
			}while(c<=3);

			System.out.println();
			i++;
			
			
		}while(i<=3);
	}
}