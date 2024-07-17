// WAJP to print sum of every digit of a number
class SumOfDigit
{
	public static void main(String []args)
	{
		int a = 152456561;
		int temp_var = a;		
		int num_of_digit = 0;

		while(!(temp_var == 0))
		{
			temp_var /= 10;
			num_of_digit++;
		}
		
		temp_var = a; // Restore value of var a in temp_var
		int sum = 0;
		for(int i=1; i<=num_of_digit; i++)
		{
			
			sum += temp_var%10;
			
			temp_var /= 10;	
		
		}
		System.out.print("Sum of every digit of number is: " + sum);


		
	}
}