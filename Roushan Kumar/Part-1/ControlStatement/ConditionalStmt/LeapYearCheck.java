//WAJP to check a year is leap year
// A year is leap year if it is evenly divisible by 4,100 and 400. However, years that are exactly divisible by 100 are not leap year, unless they are divisible by 400.
// foe ex 1700,1800,1900 are not leap year but 1600, 2000 are.

class LeapYearCheck
{
	public static void main(String []args)
	{
		int year=1800;
		if( (year%4==0 && year%100!=0) || year%400==0)
		{
			System.out.println("Yes! It is leap year");
		}else {
			System.out.println("No! The number is not a leap year.");
		      }
	}
}
		