class NestedLoopProg6_2
{
	public static void main(String []args)
	{
		int i=1;
		while(i<=2)
		{
			int j=1;
			while(j<=3)
			{
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}