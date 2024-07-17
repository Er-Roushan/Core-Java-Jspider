class NestedLoopProg10_3
{
	public static void main(String []args)
	{
		int a=1;
		int i=1;
		do
		{
			int c=1;
			do
			{
				System.out.print(a);
				System.out.print(" ");
				a++;
				c++;
			}while(c<=3);

			System.out.println();
			i++;
			
			
		}while(i<=3);
	}
}