// Armstrong number
// A number is said to be armstrong num if the power(equal to the length of number) to each digit of number, having sum of power //value of each digit is equal to that num.

class ArmstrongNum
{
	public static boolean armStrong(int num)
	{
		int cube_sum = 0;
		int val = num;
		while(num != 0)
		{
			int digit = num % 10;
			cube_sum = cube_sum + ( digit * digit * digit);
			num /= 10;
		}
		
		if(cube_sum == val)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String args[])
	{
		if(armStrong(12))
			System.out.println("Yes it is Armstrong Number");
		else
			System.out.println("No it is not an Armstrong Number");

	}
}		