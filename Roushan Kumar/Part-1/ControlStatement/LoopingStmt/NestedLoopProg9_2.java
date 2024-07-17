class NestedLoopProg9_2
{
	public static void main(String []args)
	{
		char i='P';
		while(i>='M')
		{
			int j=1;
			while(j<=3)
			{
				System.out.print(i);
				System.out.print(" ");
				j++;
			}
			System.out.println();
			i--;
		}
	}
}