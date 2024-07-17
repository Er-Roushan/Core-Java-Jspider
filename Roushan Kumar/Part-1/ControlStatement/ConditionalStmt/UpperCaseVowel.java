//WAJP to check the Character is in uppercase char and Vowel

class UpperCaseVowel
{
	public static void main(String []args)
	{	
		char ch='a';
		if((ch>=65 && ch<=90) && (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'))
		{
			System.out.println("Yes! The character is in UpperCase and is Vowel.");
		}else {
			System.out.println("No! The character is not a either Uppercase character,vowel or both .");
		      }
	}
}