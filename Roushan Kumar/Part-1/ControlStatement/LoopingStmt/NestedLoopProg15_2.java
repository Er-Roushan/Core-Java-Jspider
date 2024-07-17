class NestedLoopProg15_2
{
	public static void main(String []args)
	{
		
		int i=1;
		while(i<=3)
		{	int a=3;
			int j=1;
			while(j<=3)
			{
				System.out.print(a);
				System.out.print(" ");
				a*=3;
				j++;
			}
			System.out.println();
			i++;
		}
	}
}