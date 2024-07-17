class NestedLoopProg14_2
{
	public static void main(String []args)
	{
		
		int i=1;
		while(i<=2)
		{	char c='A';
			int j=1;
			while(j<=3)
			{
				System.out.print(c);
				System.out.print(" ");
				c+=2;
				j++;
			}
			System.out.println();
			i++;
		}
	}
}