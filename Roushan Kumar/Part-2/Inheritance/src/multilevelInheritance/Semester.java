package multilevelInheritance;

public class Semester extends Internal {
	
	Internal objint = new Internal();
	int sum_mark = objint.mark1 + objint.mark2;
	
	public void displayDetails(Semester obj) {
		System.out.println("College Name: " + obj.cname);
		System.out.println("Name: " + obj.name);
		System.out.println("Branch: " + obj.branch);
		System.out.println("Mark1: " + obj.mark1);
		System.out.println("Mark2: " + obj.mark2);
		System.out.println("Total Mark: " + obj.sum_mark);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Semester obj = new Semester();
		obj.displayDetails(obj);

	}

}
