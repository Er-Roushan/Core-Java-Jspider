package downCastingNP;

public class Cab {
	String cabstr = "Hey!! i'm from parent class.";

	public static void main(String[] args) {
		Cab c= new Mini(); //upcasting
		System.out.println(c.cabstr);
//		System.out.println(c.ministr); parent class object can't access the child class member
	}
}
