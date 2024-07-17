// WAJP to print every digit of a number
class DigitPrint
{
	public static void main(String []args)
	{
		int a = 152456;
		int temp_var = a;		
		int num_of_digit = 0;

		while(!(temp_var == 0))
		{
			temp_var /= 10;
			num_of_digit++;
		}
		
		temp_var = a; // Restore value of var a in temp_var
		int digit;
		for(int i=1; i<=num_of_digit; i++)
		{
			
			digit = temp_var%10;
			temp_var /= 10;	
		System.out.print(digit + " ");

		}
		


		
	}
}