class NestedLoopProg6_3
{
	public static void main(String []args)
	{
		int i=1;
		do
		{
			int c=1;
			do
			{
				System.out.print("* ");
				c++;
			}while(c<=3);

			System.out.println();
			i++;
			
			
		}while(i<=2);
	}
}