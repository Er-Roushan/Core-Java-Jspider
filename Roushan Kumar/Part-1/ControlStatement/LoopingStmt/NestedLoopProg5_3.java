class NestedLoopProg5_3
{
	public static void main(String []args)
	{
		int i=1;
		do
		{
			int c=5;
			do
			{
				System.out.print(c);
				System.out.print(" ");
				c+=5;
			}while(c<=20);

			System.out.println();
			i++;
			
			
		}while(i<=3);
	}
}