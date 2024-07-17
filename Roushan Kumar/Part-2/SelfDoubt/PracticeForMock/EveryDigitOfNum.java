class EveryDigitOfNum
{	

	
	static int arr[] = new int[10];
	

//digit extraction from number
	public static void method1(int num)
	{ 	
		int temp = num;
		
		//int arr[] = new int[10];
		
		int count=0;

		// for to find num of digit in enterd number
		while(temp != 0 )
		{
			temp = temp/10;
			count++;
		}

		//To store each digit in an array
		if(count>10)
		{
			System.out.println("Please enterd number having number of digit upto 10");
		}else{	
			int temp2 = num;
		     	for(int i=0; i<count; i++)
			{
				arr[i]=temp2 % 10;
				temp2 = temp2 / 10;
			}
		     }

		//To access the digit 
		for(int j=count-1, k=1; j>=0; j--, k++)
		{
			System.out.println(k + " digit is: " + arr[j]);
			
		}
	}

//sum of all the digit of number
		public static int sumOfDigit()
		{
			int sum = 0;
			for ( int i=0 ; i<arr.length; i++)
			{
				sum = sum + arr[i];
			}
			return sum;
		}
//Main Method
	public static void main(String args[])
	{	


		method1(2134567890);
		int sum_of_digit = 0;
		sum_of_digit =  sumOfDigit();
		System.out.println(sum_of_digit);
		

	}
}