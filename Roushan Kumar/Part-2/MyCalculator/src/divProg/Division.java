package divProg;

public class Division {

		public static int div(int dividend, int divisor) {
			int quotient =  dividend/divisor;
			return quotient;
		}
		
		public static float div(float dividend, float divisor) {
			float quotient =  dividend/divisor;
			return quotient;
		}
		
		public static float div(float dividend, int divisor) {
			float quotient =  dividend/divisor;
			return quotient;
		}
		
		public static float div(int dividend, float divisor) {
			float quotient =  dividend/divisor;
			return quotient;
		}
		
		public static double div(double dividend, double divisor) {
			double quotient =  dividend/divisor;
			return quotient;
		}
		
		public static void main(String args[]) {
			System.out.println(div(4,1));
			System.out.println(div(4.2f,2.1f));
			System.out.println(div(4.2f,2));
			System.out.println(div(4,1.5f));
			System.out.println(div(4.5,2.5));
			
		}
}
