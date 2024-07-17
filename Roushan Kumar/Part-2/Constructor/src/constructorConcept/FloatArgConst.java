package constructorConcept;

public class FloatArgConst {
	
	float b;
	public FloatArgConst(float a) {
		 b=a;
		System.out.println("Object created...");
		System.out.println(b);
	}
public static void main(String[] args) {
	
	FloatArgConst obj = new FloatArgConst(7.3f);
	System.out.println(obj);
	
	

}

}
