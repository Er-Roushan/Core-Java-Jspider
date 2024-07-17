class ConstantCheckIfElse
{

	public static void main(String []args)
	{
		char ch='&';
		if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
		{
			System.out.println("Vowel");
		}else if ( (ch>=65 && ch<=90) || (ch>=97 && ch<=122) )
			{
				System.out.println("Consonant");
			}
		 else 
			{
				System.out.println("Invalid");
			}
	}
}
		
		

		

	