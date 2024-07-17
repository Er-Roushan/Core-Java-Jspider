//WAJP to check the character is in lower case or not

class Prog6
{
	public static void main(String []args)
	{
		char val = 'z';
		String result = ( val>= 97 && val <=122) ? "Lower case" : "Not in Lower case";
		System.out.print(result);
	}
}