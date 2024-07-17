class Divisibility
{

//Method for divisibility by 7
	public static boolean isDivisibleBy7(int num)
	{
		//Base case
		if(num == 0 || num == 7 || num == -7 || num == -0)
		{
			return true;
		}
		//if num is smaller than 7 it can't be divisible by 7(except 0)
		if( (num > 0 && num< 7) || (num > -7 && num < 0 ))
		{
			return false;
		}

		if(num>0)
		{
			// Decrease the num by 7 untill it becomes smaller than 7
			while(num >= 7)
			{
			num = num - 7;
			}
		}
		else
		{
			//Increase the num by 7 untill it becomes greater than -7

			while(num <= -7)
			{
			num = num + 7;
			}

		}

		return (num == 0); // if num is 0,  it is divisible by 7
	}

//Main method
	public static void main(String args[])
	{
		boolean val;
		val = isDivisibleBy7(-0);
		if(val)
		{
			System.out.println("Yes! it is divisible by 7");
		}
		else
		{
			System.out.println("No! It is not divisible by 7");
		}
	}
}
		