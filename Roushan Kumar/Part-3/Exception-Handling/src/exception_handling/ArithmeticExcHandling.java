package exception_handling;

public class ArithmeticExcHandling {
	
	public static void main(String[] args) {
		try {
		System.out.println(6/0);
		}
		catch(ArithmeticException obj) {
			System.out.println("Hey!!! You can't divide a number by 0.");
		}
		
		System.out.println("Exception Handled");
	}

}
