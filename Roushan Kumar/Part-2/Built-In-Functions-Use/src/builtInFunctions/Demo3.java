package builtInFunctions;
import java.util.Scanner;
public class Demo3 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the char: ");
		char a = obj.next().charAt(0);
		System.out.println(a);
		char b = obj.next().charAt(1);
		System.out.println(b);
		
		obj.close();

	}

}
