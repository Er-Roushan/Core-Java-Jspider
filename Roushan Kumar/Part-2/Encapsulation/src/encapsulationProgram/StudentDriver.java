package encapsulationProgram;

public class StudentDriver {

	public static void main(String[] args) {
		
		Student obj = new Student("Roushan Kumar", 8677867330l, 2072051, 405, "Mrsptu", 643007109821l);
		System.out.println("Student Name: "+ obj.getName());
		System.out.println("Student Phno: " +obj.getPhno());
		System.out.println("Student Roll No: "+obj.getRollno());
		System.out.println("Student Mark: "+obj.getMark());
		System.out.println("Student College: "+ obj.getCollege_name());
		
		
		//setter
//		obj.setPhno(8677867330l);
		obj.setPhno(6207668188l);
		System.out.println("Updated phone no is: "+obj.getPhno());
		
//		obj.setMark(405);
		obj.setMark(425);
		System.out.println("Updated Mark is: "+obj.getMark());
		
		
	
		
	}

}
