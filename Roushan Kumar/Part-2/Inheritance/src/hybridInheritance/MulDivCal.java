package hybridInheritance;

public class MulDivCal extends AddSubCal {
	
	public void mul(MulDivCal obj) {
		System.out.println("mul is: "+ (obj.n1 * obj.n2));
	}
	
	public void div(MulDivCal obj) {
		System.out.println("div is: "+ (obj.n1 / obj.n2));
	}

 public static void main(String [] args) {
	 
	 MulDivCal obj1 = new MulDivCal();
	 obj1.sum(obj1.n1, obj1.n2);
	 obj1.sub(obj1); // Upcasting
	 obj1.mul(obj1);
	 obj1.div(obj1);
 }

}
