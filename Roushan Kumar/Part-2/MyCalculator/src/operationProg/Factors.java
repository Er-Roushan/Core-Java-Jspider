package operationProg;

public class Factors {
	
	public static void factorMethod(int num) {
		
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				System.out.println(i);
			}
		}
		
	}

	public static void main(String[] args) {
		
			factorMethod(18);
	}

}
