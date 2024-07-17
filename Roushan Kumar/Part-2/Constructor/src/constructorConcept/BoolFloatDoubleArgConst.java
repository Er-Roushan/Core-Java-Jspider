package constructorConcept;

public class BoolFloatDoubleArgConst {
	
	float b;
	boolean bool;
	double db;
	public BoolFloatDoubleArgConst(boolean bool, float f, double d) {
		 b=f;
		 this.bool = bool;
		 db = d;
		System.out.println("Object created...");
		System.out.println(this.bool + " "+ b +" "+ db);
	}
public static void main(String[] args) {
	
	BoolFloatDoubleArgConst obj = new BoolFloatDoubleArgConst(true, 7.3f, 4.56);
	System.out.println(obj);
	
	

}

}
