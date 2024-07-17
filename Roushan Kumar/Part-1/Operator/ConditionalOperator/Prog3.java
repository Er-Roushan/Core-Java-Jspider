//WAJP to check the character is upper case character or not

class Prog3
{
	public static void main (String []args)
	{
		char val = 'Z';
		String result = (val>=65 && val<=90) ? "Yes character is in upper case" : "No character is not in upper case";
		System.out.print(result);
	}
}