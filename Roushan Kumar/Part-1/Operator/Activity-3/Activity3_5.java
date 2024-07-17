//WAJP to print the sum of all the odd digits of a number
class Activity3_5
{
	public static void main(String[] args)
	{
		int a= 345;
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