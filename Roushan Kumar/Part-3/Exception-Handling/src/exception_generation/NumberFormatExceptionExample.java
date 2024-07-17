package exception_generation;

public class NumberFormatExceptionExample {
	
	public static void main(String[] args) {
        String invalidNumber = "123abc";
       
        int number = Integer.parseInt(invalidNumber);
        System.out.println("The number is: " + number);
    }

}
