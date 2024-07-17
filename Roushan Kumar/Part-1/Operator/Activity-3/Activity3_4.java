//WAJP to print the sum of all the even digits of a number
class Activity3_4
{
	public static void main(String[] args)
	{
		int a= 416;
		int digit1 = a%10;
		a=a/10;
		int digit2 = a%10;
		a=a/10;
		System.out.println(a);
		System.out.println(digit2);
		System.out.println(digit1);

		System.out.println("==============");

		int sum = a + digit1;
		System.out.println(sum);
	}
}