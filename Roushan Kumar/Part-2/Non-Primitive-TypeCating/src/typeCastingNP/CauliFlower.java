package typeCastingNP;

public class CauliFlower extends Vegetable {
	
	String strcauli = " Hey i'm from child class.";

	public static void main(String[] args) {
		
		Vegetable v = new CauliFlower();
		System.out.println(v.str);
		System.out.println(v.a);
//		System.out.println(v.strcauli);
		
		CauliFlower c = (CauliFlower) v;
		System.out.println(c.strcauli);

	}

}
