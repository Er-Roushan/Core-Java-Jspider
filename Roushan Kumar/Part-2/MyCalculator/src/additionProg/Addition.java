package additionProg;

public class Addition {
	
	public static int add(int num1, int num2) {
		
		int sum = num1 + num2;
		
		
		return sum;
		
	}
	
	public static float add(float num1, float num2) {
		float sum =  num1 + num2;
		
		
		return sum;
	}
	
	public static float add(float num1, int num2) {
		float sum =  num1 + num2;
		
		
		return sum;
	}
	
	public static float add(int num1, float num2) {
		float sum =  num1 + num2;
		
		
		return sum;
	}
	
	public static double add(double num1, double num2) {
		double sum =  num1 + num2;
		
		
		return sum;
	}
	
	public static void main(String args[]) {
			System.out.println(add(5.3f,3.2f));
			System.out.println(add(5.3,3.2));
			System.out.println(add(5.3f,3));
	}
}
