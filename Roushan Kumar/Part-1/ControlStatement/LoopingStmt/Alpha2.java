class Alpha2
{
	public static void main(String []args)
	{       
		// for ( char c='A'; true; c = (char) (c + 2)) [ye v chlega]

		// compound assignment operator use krte waqt explicitly conversion nhi karna hota
		for ( char c='A'; true; c+=2)
		{
		    System.out.println(c);
		}
	}
}