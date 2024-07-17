// WAJP to print power of a number
class PowCal
{
	public static void main(String []args)
	{	
		int val=4;
		int to_pwr=3;
		int power = 1;
 		
	
		for(int i=1; i<=to_pwr; i++)
		{	
			power *= val;		
		}

		System.out.print("The Power of " + val + " is: " + power);
	}
}