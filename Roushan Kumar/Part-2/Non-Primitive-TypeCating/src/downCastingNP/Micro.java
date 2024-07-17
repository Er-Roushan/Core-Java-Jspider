package downCastingNP;

public class Micro extends Cab {
	
	String microstr = "Hey!! i'm from Micro Child class.";
	
	public static void main(String[] args) {
		Cab c= new Mini(); //upcasting
		//System.out.println(c.ministr);
		
		System.out.println(c.cabstr);
		
	//	Micro m = (Mini) c; //not possible because of parent class object ref var does'nt containing the the Micro class obj ref here
		
		Cab c2 = new Micro(); //upcasting
		System.out.println(c2.cabstr);
		//System.out.println(c2.microstr);
		
		Micro mi = (Micro) c2;
		System.out.println(mi.microstr);
	}
}
