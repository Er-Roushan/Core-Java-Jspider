//WAJP to reverse a number (also valid for palindrome num)
class NumRev
{
	public static int method1(int num)
	{
		int rev = 0, reminder;
		while(num !=0 )
		{
			reminder = num % 10;
			num /= 10;
			rev = rev * 10 + reminder;
		}		
		return rev;
	}
		
	public static void main(String args[])
	{
		int a;
		a = method1(1331);
		System.out.println(a);
	}
}
		
		
		