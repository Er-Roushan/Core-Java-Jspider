class RevPyaramidPattern
{
	public static void revPyramidPat(int num)
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
	}

	public  static void main(String args[])
	{
		revPyramidPat(15);
	}
} 