//WAJP print product of all digit of a number

class Activity3_3
{
	public static void main(String[] args)
	{
		int a= 325;
		int digit1 = a%10;
		a=a/10;
		int digit2 = a%10;
		a=a/10;
		System.out.println(a);
		System.out.println(digit2);
		System.out.println(digit1);

		System.out.println("==============");

		int product = a * digit2 * digit1;
		System.out.println(product);
	}
}