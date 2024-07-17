class NestedLoopProg5_2
{
	public static void main(String []args)
	{
		int i=1;
		while(i<=3)
		{
			int j=5;
			while(j<=20)
			{
				System.out.print(j);
				System.out.print(" ");
				j+=5;
			}
			System.out.println();
			i++;
		}
	}
}