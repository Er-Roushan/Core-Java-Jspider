package exception_handling;
import java.util.*;
public class InputMismatchHandling {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);		
		System.out.print("enter a value: ");
		
		
		try {
		int a = obj.nextInt();
		System.out.println("Entered value is: " + a);
		}		
		catch  (InputMismatchException e) {
			System.out.println("Invalid input! Please enter an integer.");
		}
		
		System.out.println("Exception Handled");
		obj.close();

	}

}
