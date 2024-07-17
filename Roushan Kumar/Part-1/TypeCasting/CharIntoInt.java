//WAJP to convert a character into a number
class CharIntoInt
{
	public static void main(String[] args)
	{
		char a = 'A';
		char b = 'a';

		//typecasting of char into int
		int num1 = (int)a;
		int num2 = (int)b;
		
		System.out.println(a);
 		System.out.println(b);
		System.out.println(num1);
		System.out.println(num2);

		int num3 = 91;
		char val = (char) num3;
		System.out.println(val);
	}
}