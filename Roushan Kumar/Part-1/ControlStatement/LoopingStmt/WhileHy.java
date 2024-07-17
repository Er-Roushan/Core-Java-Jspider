//JP to print 'Hy' infinite time

class WhileHy
{
	public static void main(String []args)
	{
		// We can't directly pass false to the while if we doing so we get CTE

		while(true)
		{
			System.out.println("Hy");
		}
	}
} 