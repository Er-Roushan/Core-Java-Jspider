class NestedLoopProg2_2
{
	public static void main(String []args)
	{
		int i=1;
		while(i<=2)
		{
			char c='C';
			while(c<='F')
			{
				System.out.print(c);
				c++;
			}
			System.out.println();
			i++;
		}
	}
}