package exception_handling;

public class StackOverflowExHandling {
	
	public static void m1() {
		m2();
	};
	public static void m2() {
		m1();
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			m2();
		}
		catch(StackOverflowError obj) {
			System.out.println("You are not given condition to stop recursion.");
		}
		
		System.out.println("Exception Handled.");
	}

}
