class NestedLoopProg4_2
{
	public static void main(String []args)
	{
		int i=1;
		while(i<=3)
		{
			char c='Z';
			while(c>='W')
			{
				System.out.print(c);
				c--;
			}
			System.out.println();
			i++;
		}
	}
}