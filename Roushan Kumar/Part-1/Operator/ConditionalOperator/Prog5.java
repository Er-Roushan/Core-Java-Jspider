//WAJP to check character is vowel or not

class Prog5
{
	public static void main(String []args)
	{
		char val='z';
		String result; 
		result = (val=='a' || val=='e' || val=='i' || val=='o' || val=='u' || val=='A'|| val=='E'|| val=='I'|| val=='O'|| val=='U') ? "Yes it is vowel" : "No not vowel";
		System.out.print(result);
	}
}