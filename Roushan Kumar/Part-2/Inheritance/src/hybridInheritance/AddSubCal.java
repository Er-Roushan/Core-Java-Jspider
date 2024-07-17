package hybridInheritance;

public class AddSubCal extends Data {
	
	public void sum(int a, int b) {
		System.out.println("sum is: " + (a+b));
	}
	
	public void sub(AddSubCal obj) {
		System.out.println("sub is: "+ (obj.n1 - obj.n2));
	}

}
