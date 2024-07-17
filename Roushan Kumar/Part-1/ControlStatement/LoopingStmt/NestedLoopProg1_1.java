class NestedLoopProg1_1
{
	public static void main(String []args)
	{
		for (int i=1; i<=3; i++)
		{
			//char c='A';
			//for(int j=1; j<=3; j++)

			for(char c='A'; c<='C'; c++)
			{
				//System.out.print(c);
				//c++;

				System.out.print(c); //Optimised code
			}
			
				System.out.println();
		}
	}
}