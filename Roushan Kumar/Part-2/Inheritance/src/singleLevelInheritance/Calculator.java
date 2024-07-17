package singleLevelInheritance;

public class Calculator extends Number {
	
	public void sum(Calculator obj) {
		System.out.println("Sum is: " + (obj.n1 + obj.n2));
	}

	public void sub(Calculator obj) {
		System.out.println("Sub is: " + (obj.n1 - obj.n2));
	}
	
	public void mul(Calculator obj) {
		System.out.println("Mul is: " + (obj.n1 * obj.n2));
	}
	
	public static void main(String[] args) {
		
		Calculator obj = new Calculator();
		obj.sum(obj);
		obj.sub(obj);
		obj.mul(obj);

	}

}
