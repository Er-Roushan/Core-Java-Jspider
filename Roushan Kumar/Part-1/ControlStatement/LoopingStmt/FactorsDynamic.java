// WAJP to find the factors of a number (+ve)
class FactorsDynamic
{
	public static void main(String []args)
	{
		int a=15;
		System.out.print("Factors of " + a + " is:");
		for(int i=1; i<=a; i++)
		{
			if(a%i==0)
			{
				System.out.print(i + " ");
			}
		}
	}
}