import java.util.Scanner; //Import the Scanner Class
class WeekDays
{
	public static void main(String []args)
	{
		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.print("Enter the values between 1 to 7: ");
		int  val = myObj.nextInt(); // Read int value from user
		System.out.println("Entered value is: " + val);

		if(val<1 || val>7)
		{
			System.out.println("Invalid Number.");
			
		}else if(val == 1)
		      {
			System.out.println("Sunday");
		      }
		 else if(val == 2)
		      {
			System.out.println("Monday");
		      }
		 else if(val == 3)
		      {
			System.out.println("Tuesday");
		      }
		 else if(val == 4)
		      {
			System.out.println("Wednesday");
		      }
		 else if(val == 5)
		      {
			System.out.println("Thrusday");
		      }
		 else if(val == 6)
		      {
			System.out.println("Friday");
		      }
		 else 
		      {
			System.out.println("Saturday");
		      }
			
		

	}
}
		