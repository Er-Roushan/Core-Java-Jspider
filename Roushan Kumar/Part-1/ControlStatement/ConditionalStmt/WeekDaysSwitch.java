class WeekDaysSwitch
{
	public static void main(String []args)
	{
		int val=3;
		
		switch(val)
		{
			
			// Here control jumps case to case so use of curley braces is optional (even for multiple stmts in a case)			

			case 1:
				System.out.println("Sunday");
				break;

			case 2:
				System.out.println("Monday");
				break;

			case 3:
				System.out.println("Tuesday");
				break;

			case 4:
				System.out.println("Wednesday");
				break;

			case 5:
				System.out.println("Thrusday");
				break;

			case 6:
				System.out.println("Friday");
				break;

			case 7:
				System.out.println("Saturday");
				break;

			default:
				System.out.println("Invalid Number");
		}
	}
}
