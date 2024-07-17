package multiProg;

public class Multiplication {
	
			public static int mul(int num1, int num2) {
				int product = num1 * num2;
				return product;
			}
			
			public static float mul(float num1, float num2) {
				float product = num1 * num2;
				return product;
			}
			
			public static float mul(float num1, int num2) {
				float product = num1 * num2;
				return product;
			}
			
			public static float mul(int num1, float num2) {
				float product = num1 * num2;
				return product;
			}
			
			public static double mul(double num1, double num2) {
				double product = num1 * num2;
				return product;
			}

			public static void main(String args[]) {
				System.out.println(mul(4,5));
				System.out.println(mul(4.2f,2.1f));
				System.out.println(mul(4.2f,2));
				System.out.println(mul(4, 1.5f));
				System.out.println(mul(4.5,2.5));
			}
	}



