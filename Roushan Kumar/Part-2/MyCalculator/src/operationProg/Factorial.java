package operationProg;

public class Factorial {
	
	public static int facto(int num) {
		int factorial=1;
		for(int i=num; i>=1; i--) {
			factorial *= i;
		}
		return factorial;
	}

	public static void main(String[] args) {
		System.out.println(facto(5));

	}

}
