package operationProg;

public class Cube {
	
	public static int cub(int num) {
		int cube_value = num * num * num;
		return cube_value;
	}
	
	public static float cub(float num) {
		float cube_value = num * num * num;
		return cube_value;
	}
	
	public static double cub(double num) {
		double cube_value = num * num * num;
		return cube_value;
	}
	public static void main(String[] args) {
		System.out.println(cub(2));
		System.out.println(cub(3.2f));
		System.out.println(cub(4.2));

	}

}
