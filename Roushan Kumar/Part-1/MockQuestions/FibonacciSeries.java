//Fibonacci Series
class FibonacciSeries
{
	public static void fib(int num)
	{
		int first_num = 0, second_num = 1;
		int sum;
		if(num>=0)
		{
			System.out.print(0 + " ");
		}
		if(num>=1)
		{
			System.out.print(1 + " ");
		}
		for(int i=2; i<num; i++)
		{
			sum = first_num + second_num;
			System.out.print(sum + " ");
			first_num = second_num;
			second_num = sum;
		}
	}
	
	public static void main(String args[])
	{
		fib(15);
	}
}
			