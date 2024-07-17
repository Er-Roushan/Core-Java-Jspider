package operationProg;

public class Square {
	
	public static int sqr(int num) {
		int result = num * num;
		return result;
	}
	
	public static float sqr(float num) {
		float result = num * num;
		return result;
	}

	public static double sqr(double num) {
		double result = num * num;
		return result;
	}
	public static void main(String[] args) {

			System.out.println(sqr(2));
			System.out.println(sqr(2.4f));
			System.out.println(sqr(5.5));

	}

}
