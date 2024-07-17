class NestedLoopProg3_2
{
	public static void main(String []args)
	{
		int i=1;
		while(i<=3)
		{
			int j=4;
			while(j<=7)
			{
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}
	}
}