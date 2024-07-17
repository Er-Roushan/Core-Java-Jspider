package hierarchicalInheritance;



public class MulDivCal extends Data {
	
	public void mul(MulDivCal obj) {
		System.out.println("mul is: "+ (obj.n1 * obj.n2));
	}
	
	public void div(MulDivCal obj) {
		System.out.println("div is: "+ (obj.n1 / obj.n2));
	}

	public static void main(String[] args) {
		MulDivCal obj = new MulDivCal();
		
		obj.mul(obj);
		obj.div(obj);
	}

}
