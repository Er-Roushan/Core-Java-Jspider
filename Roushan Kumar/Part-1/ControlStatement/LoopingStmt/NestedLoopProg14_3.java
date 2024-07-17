class NestedLoopProg14_3
{
	public static void main(String []args)
	{
		
		int i=1;
		do
		{
			char val='A';
			int c=1;
			do
			{
				System.out.print(val);
				System.out.print(" ");
				val+=2;
				c++;
			}while(c<=3);

			System.out.println();
			i++;
			
			
		}while(i<=2);
	}
}