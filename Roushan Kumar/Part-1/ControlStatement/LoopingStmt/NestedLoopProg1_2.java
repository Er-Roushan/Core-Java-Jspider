class NestedLoopProg1_2
{
	public static void main(String []args)
	{
		int i=1;
		while(i<=3)
		{
			char c='A';
			while(c<='C')
			{
				System.out.print(c);
				c++;
			}
			System.out.println();
			i++;
		}
	}
}