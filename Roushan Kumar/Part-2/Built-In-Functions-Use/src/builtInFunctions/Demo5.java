package builtInFunctions;
import java.util.Scanner;
public class Demo5 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String a = obj.nextLine();
		System.out.println(a);
		obj.close();

	}

}
