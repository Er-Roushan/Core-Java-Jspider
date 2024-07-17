//WAJP to check the number is not divisible by 6(Do not directly use divide or modulus)

// If a number is divisible by 2 and 3 both then it will be divisible by 6 also.

class NotDivisibleBySix
{
	public static void main(String []args)
	{	
		int a=30;
		if(a%2!=0 || a%3!=0)
		{
			System.out.println("Yes! The number is not completely divisible by 6.");
		}else {
			System.out.println("No! The Number is divisible by 6.");
		      }
	}
}