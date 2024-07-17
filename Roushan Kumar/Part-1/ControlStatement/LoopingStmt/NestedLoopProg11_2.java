class NestedLoopProg11_2
{
	public static void main(String []args)
	{
		char c='A';
		int i=1;
		while(i<=3)
		{	
			int j=1;
			while(j<=3)
			{
				System.out.print(c);
				System.out.print(" ");
				c++;
				j++;
			}
			System.out.println();
			i++;
		}
	}
}