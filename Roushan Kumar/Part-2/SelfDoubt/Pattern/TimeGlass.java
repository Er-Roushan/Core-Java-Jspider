class TimeGlass
{
	public static void timeGlass(int num)
	{
		for(int i=1; i<=num; i++)
		{
			for(int j=i; j>1; j--)
			{
				System.out.print(" ");
			}
 			for(int k=i; k<=2*num-i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		for(int i=2; i<=num; i++)
		{
			for(int j=num; j>i; j--)
			{
				System.out.print(" ");
			}
 			for(int k=1; k<=i*2-1; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public  static void main(String args[])
	{
		timeGlass(10);
	}
} 