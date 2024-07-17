class NestedLoopProg15_3
{
	public static void main(String []args)
	{
		
		int i=1;
		do
		{
			int a=3;
			int c=1;
			do
			{
				System.out.print(a);
				System.out.print(" ");
				a*=3;
				c++;
			}while(c<=3);

			System.out.println();
			i++;
			
			
		}while(i<=3);
	}
}