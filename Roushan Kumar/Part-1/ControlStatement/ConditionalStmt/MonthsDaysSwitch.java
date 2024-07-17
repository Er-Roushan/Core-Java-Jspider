class MonthsDaysSwitch
{
	public static void main(String []args)
	{
			
		int val=1;

		switch(val)
		{
			
			// Here control jumps case to case so use of curley braces is optional (even for multiple stmts in a case)			

			case 1:
				System.out.println(31);
				break;

			case 2:
				System.out.println("28 or 29");
				break;

			case 3:
				System.out.println(31);
				break;

			case 4:
				System.out.println(30);
				break;

			case 5:
				System.out.println(31);
				break;

			case 6:
				System.out.println(30);
				break;

			case 7:
				System.out.println(31);
				break;

			case 8:
				System.out.println(31);
				break;

			case 9:
				System.out.println(30);
				break;

			case 10:
				System.out.println(31);
				break;

			case 11:
				System.out.println(30);
				break;

			case 12:
				System.out.println(31);
				break;

			default:
				System.out.println("Invalid Number");
		}
			
		

	}
}