//WAJP to check the Character is a special character

class SpecialCharacter
{
	public static void main(String []args)
	{	
		char ch='A';
		if(!((ch>=65 && ch<=90) || (ch>=97 && ch<=122) || (ch>=48 && ch<=57)))
		{
			System.out.println("Yes! The character is a Special Character.");
		}else {
			System.out.println("No! The character is not a special character.");
		      }
	}
}