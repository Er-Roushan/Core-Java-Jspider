package subProg;

public class Substraction {
	
	public static int sub(int num1, int num2) {
		
		int remaining = num1 - num2;
		
		return remaining;
	}
	
    public static float sub(float num1, float num2) {
		
		float remaining = num1 - num2;
		
		return remaining;
	}
    
    public static float sub(float num1, int num2) {
		
 		float remaining = num1 - num2;
 		
 		return remaining;
 	}
    
    public static float sub(int num1, float num2) {
		
 		float remaining = num1 - num2;
 		
 		return remaining;
 	}
	
  public static double sub(double num1, double num2) {
		
 		double remaining = num1 - num2;
 		
 		return remaining;
 	}
	
	public static void main(String [] args) {
		System.out.println(sub(1,3));
		System.out.println(sub(4.5f,3.2f));
		System.out.println(sub(5.6f,3));
		System.out.println(sub(6,3.2f));
		System.out.println(sub(5.4,3.4));
		
	}

}
