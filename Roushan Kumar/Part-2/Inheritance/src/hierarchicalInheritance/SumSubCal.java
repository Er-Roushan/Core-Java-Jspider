package hierarchicalInheritance;



public class SumSubCal extends Data {
	

	public void sum(int a, int b) {
		System.out.println("sum is: " + (a+b));
	}
	
	public void sub(SumSubCal obj) {
		System.out.println("sub is: "+ (obj.n1 - obj.n2));
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SumSubCal obj = new SumSubCal();
		obj.sum(obj.n1, obj.n2);
		obj.sub(obj);

	}

}
