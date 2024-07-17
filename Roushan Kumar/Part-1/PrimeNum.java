class PrimeNum
{
	public static void main(String []args)
	{	
		int val1 = 1;
		int val2 = 20;
		int sum=0;
		for(int i=val1; i<=val2; i++)
		{
			for(int j=2; j<=i; j++)
			{
				if(i%j==0)
				{
					sum += i;
					break;
				}
			}
		}
		System.out.println("Sum of all Prime number between " + val1 + " and " + val2 + " is:" + sum );
	}
}