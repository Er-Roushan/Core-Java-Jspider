package constructorConcept;

public class IntIntFloDouArgConst {
	

	int arg1, arg2;
	float fl;
	double db;
	public IntIntFloDouArgConst(int a, int b, float f, double d) {
		 arg1=a;
		 arg2 = b;
		 fl=f;
		 db = d;
		System.out.println("Object created...");
		System.out.println(arg1 + " "+ arg2 +" "+fl +" " + db);
	}
	public static void main(String[] args) {
	
		IntIntFloDouArgConst obj = new IntIntFloDouArgConst(5, 7, 4.5f, 4.96);
		System.out.println(obj);
	
	

	}

}
