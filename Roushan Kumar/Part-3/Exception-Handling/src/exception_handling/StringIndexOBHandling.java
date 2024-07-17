package exception_handling;

public class StringIndexOBHandling {
	public static void main(String[] args) {
		
		String str = "Roushan";
		try {
		System.out.print(str.charAt(8));
		}
		catch(StringIndexOutOfBoundsException obj) {
			System.out.println("Length of string is smaller than you are accessing.");
		}
		
		System.out.println("Exception Handled");
	}

}
