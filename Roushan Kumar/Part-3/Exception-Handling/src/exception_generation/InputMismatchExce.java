package exception_generation;
import java.util.*;
public class InputMismatchExce {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);		
		System.out.print("enter a value: ");
		int a = obj.nextInt(); //enter a float value during runtime 
		obj.close();

	}

}

