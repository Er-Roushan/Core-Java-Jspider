//WAJP to check whether a number is prime or not
//Number should be +ve

class IsPrime
{
	public static boolean primeCheck(int num)
	{
		if(num == 0 || num == 1)
		{
			return false;
		}
		else
		{
			for(int i=2; i<num; i++)
			{
				if( num % i == 0 )
				return false;
			}
		}

		return true;
	}

	public static void main(String args[])
	{
		boolean bool;
		bool = primeCheck(0);
		if(bool)
			System.out.println("Yes it is prime number");
		else
			System.out.println("No it is not a prime number");

	}
}