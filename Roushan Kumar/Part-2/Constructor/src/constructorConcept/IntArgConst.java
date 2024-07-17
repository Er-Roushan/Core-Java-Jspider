package constructorConcept;

public class IntArgConst {
	
		int b;
		public IntArgConst(int a) {
			 b=a;
			System.out.println("Object created...");
			System.out.println(b);
		}
	public static void main(String[] args) {
		
		IntArgConst obj = new IntArgConst(7);
		System.out.println(obj);
		
		

	}
	
	
}
