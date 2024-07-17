//WAJP for Automorphic number
//An Automorphic number is a number whose square ends in the same digits as the number itself. Examples: 5*5 = 25, 6*6 = 36, 25*25 = 625, 76 * 76 = 5776

class AutomorphicNum
{
	public static boolean Automorphic(int num)
	{
		long a;
		 a = (long)num;
		 a *= a;
		long digit_num, digit_a;
		
		while(num != 0)
		{
			digit_num = num % 10;
			digit_a = a % 10;
			if( digit_num != digit_a )
			 {
				return false;
			 }

			num /= 10;
			a = a / 10;
		}
		return true;
		
	}
	
	public static void main(String args[])
	{
		if(Automorphic(12890625))
		{
			System.out.println("Yes it is automorphic number");
		}
		else
		{
			System.out.println("No it is not an automorphic number.");
		}
		
		/* //converting int to long
		long a;
		a = 2890625 * 2890625l;
		System.out.println(a);
		*/
	}
}