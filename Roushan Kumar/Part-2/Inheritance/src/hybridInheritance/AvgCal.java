package hybridInheritance;

public class AvgCal extends Data {
	
	public void avg(AvgCal obj) {
		System.out.println("Avg of given no is: " + ((obj.n1 + obj.n2)/2));
	}
	
	public static void main(String [] args) {
		AvgCal obj = new AvgCal();
		
		obj.avg(obj);
	}
	

}
