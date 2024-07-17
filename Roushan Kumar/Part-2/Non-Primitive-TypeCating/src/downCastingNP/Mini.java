package downCastingNP;

public class Mini extends Cab {
	String ministr = "Hey!! i'm from Mini Child class.";
	
	public static void main(String[] args) {
		Cab c= new Mini(); //upcasting
		//System.out.println(c.ministr);
		
		System.out.println(c.cabstr);
		
		Mini m = (Mini) c; //downcasting 
		System.out.println(m.ministr);
	}
}
