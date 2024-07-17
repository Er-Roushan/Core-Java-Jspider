package exception_generation;

public class StackOverFlowExce {

	public static void m1() {
		m2();
	};
	public static void m2() {
		m1();
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m2();

	}

}
