package singleLevelInheritance;

public class SICalculator extends Customer {

	public void si(SICalculator obj1) {
		System.out.println("SI: "+ ((p*r*t)/100));
	}
	public static void main(String[] args) {
		
		SICalculator obj = new SICalculator();
		obj.si(obj);
		

	}

}
