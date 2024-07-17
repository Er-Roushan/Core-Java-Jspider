package builtInFunctions;
import java.util.Scanner;
public class StudentInfo {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter Your class: ");
		int standard = obj.nextInt();
		
		System.out.print("Enter Your Section: ");
		char section = obj.next().charAt(0);
		
		System.out.print("Enter your Roll No: ");
		int roll = obj.nextInt();
		
		
		
		obj.nextLine();
		
		System.out.print("Enter Your name: ");
		String sname = obj.nextLine();
		
		System.out.print("Enter Your father name: ");
		String fname = obj.nextLine();
		
		System.out.print("Enter Your Mother name: ");
		String mname = obj.nextLine();
		
		System.out.print("Enter Your Address: ");
		String address = obj.nextLine();
		
		System.out.print("Enter Your Parent contact No: ");
		long pcontact = obj.nextLong();
		
		
		
		
		
		
		
		System.out.println("Roll No: " + roll);
		System.out.println("class: " + standard);
		System.out.println("Section: " + section);
		System.out.println("Name: " + sname);
		System.out.println("Father Name: " + fname);
		System.out.println("MotherName: " + mname);
		System.out.println("Address: " + address);
		System.out.println("Parent Contact: " + pcontact);
		
		
		obj.close();
		

	}

}
