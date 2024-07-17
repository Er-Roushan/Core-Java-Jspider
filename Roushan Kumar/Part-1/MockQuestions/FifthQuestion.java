//WAJP to create a method which accept a number and return sum of square of factorial of sum of factors of digit of a number

class FifthQuestion
{
	static int arr[] = new int[10];
	static int final_sum = 0;

	public static int m1(int num)
	{
		int temp1 = num;
		int count = 0;
		while(temp1 != 0)
		{
			temp1 /= 10;
			count++;
		}
		int temp2 = num;
		for(int i=0; i<count; i++)
		{
			arr[i] = temp2 % 10;
			temp2 /= 10;
		}
		/* for(int k=0; k<count; k++)
		{ System.out.println(arr[k]); }  */
		
		for(int j=0; j<count; j++)
		{
			int a = arr[j];
			int sum = 0;
			for(int k=1; k<=a; k++)
			{
				if(a % k == 0)
				{
					sum += k; 
				}
			}
			int factorial_of_sum = 1;
			for(int p=1; p<=sum; p++)
			{
				factorial_of_sum *= p;
			}
			
			// Square of factorial
			factorial_of_sum *= factorial_of_sum;
			final_sum += factorial_of_sum;
		}

		return final_sum;  
	}

	public static void main(String args[])
	{
		int a;
		a = m1(123);
		System.out.println(a);
	}
}