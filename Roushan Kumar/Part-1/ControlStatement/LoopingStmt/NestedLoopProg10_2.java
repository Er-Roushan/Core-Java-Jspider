class NestedLoopProg10_2
{
	public static void main(String []args)
	{
		int a=1;
		int i=1;
		while(i<=3)
		{
			int j=1;
			while(j<=3)
			{
				System.out.print(a);
				System.out.print(" ");
				a++;
				j++;
			}
			System.out.println();
			i++;
		}
	}
}