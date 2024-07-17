//WAJP to find a number is even or not without using modulus operator
class EvenNum
{
	public static boolean method1(int num)
	{
		if( ( num & 1 ) == 0)
			return true;
		return false;
	}
	
	public static void main(String args[])	
	{
		if(method1(33))
		{
			System.out.println("Yes it is even");
		}
		else
		{
			System.out.println("No it is not even");
		}
	}
}