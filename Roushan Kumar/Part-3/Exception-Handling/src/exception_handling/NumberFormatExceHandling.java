package exception_handling;

public class NumberFormatExceHandling {

	public static void main(String[] args) {
		
        String invalidNumber = "123abc";
       try {
        int number = Integer.parseInt(invalidNumber);
       }
       catch(NumberFormatException obj) {
        System.out.println("String does'nt contain only number value.");
       }
       
       System.out.println("Exception Handled.");
    }
}
