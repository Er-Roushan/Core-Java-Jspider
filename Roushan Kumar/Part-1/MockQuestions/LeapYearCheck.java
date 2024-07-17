//WAJP to check whether a year is leap year or not
class LeapYearCheck
{
	public static boolean method(int year)
	{
		if((year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0 )
		{
			return true;
		}
		return false;
	}
	

	public static void main(String args[])
	{
		if(method(1800))
		{
			System.out.println("Yes it is a leap year.");
		}
		else
		{
			System.out.println("No it is not a leap year.");
		}
	}
}