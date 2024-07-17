/* A neon number is a number where the sum of digits of square of the number is equal to the number. 
   For example if the input number is 9, its square is 9*9 = 81 and sum of the digits is 9. i.e. 9 is a neon number. */
class NeonNum
{
	public static boolean neonNum(int num)
	{
		int sq = num * num;
		int sq_digit_sum = 0,rem;
		int temp = num;
		while( temp !=0 )
		{
			rem = temp % 10;
			sq_digit_sum += rem;
			temp /= 10;
		}
		if ( sq_digit_sum == num )
		{
			return true;
		}
		return false;
	}

	public static void main(String args[])
	{
		if(neonNum(9))
			System.out.println("Yes it is a neon num.");
		else
			System.out.println("No it is not a neon num.");
	}
}