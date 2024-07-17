package singleLevelInheritance;

public class Power extends PowerNumber {
	
	public void sqr(Power obj1) {
		System.out.println("Square value is: " + obj1.n*obj1.n);
	}
	
	public void cube(Power obj1) {
		System.out.println("cube value is: " + obj1.n*obj1.n*obj1.n);
	}

	public static void main(String[] args) {
		
		Power obj = new Power();
		obj.sqr(obj);
		obj.cube(obj);
	
	}

}
