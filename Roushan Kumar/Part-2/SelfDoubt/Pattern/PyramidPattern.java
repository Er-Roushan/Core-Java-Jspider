class PyramidPattern
{

	public static void pyramidPat(int num)
	{
		for(int i=1; i<=num; i++)
		{
			//Loop for space
			for(int j=1; j<=num-i; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++)
			{
				System.out.print("*");
			}
			
			//New line
			System.out.println();
		}
	}

	public static void main(String args[])
	{
		pyramidPat(15);
	}
}
			











	