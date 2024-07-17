//WAJP for buzz number
//A number is said to be Buzz Number if it ends with 7 or is divisible by 7. Example: 1007 is a Buzz Number.
class BuzzNum
{
	public static boolean buzz(int num)
	{
		int rem;
		rem = num % 10;
		if( rem == 7 || num % 7 == 0)
		{
			return true;
		}
		return false;
	}

	public static void main(String args[])
	{
		if(buzz(1009))
			System.out.println("Yes it is a Buzz Number.");
		else
			System.out.println("No it is not a Buzz Number.");
	}
}