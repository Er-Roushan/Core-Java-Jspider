//WAJP to 
package wrapper_classes;

public class StudentInfo {
	
	private String sname;
	private String roll_no;
	private String section;
	private String phone_no;
	
	public void setinfo(String sname, String sroll, String section, String phoneno) {
		this.sname = sname;
		this.roll_no = sroll;
		this.section = section;
		this.phone_no=phoneno;
	}
	
	public void getInfo() {
		System.out.println("Student Name: "+this.sname);
		System.out.println("Student Roll: "+ Integer.parseInt(this.roll_no));
		System.out.println("Student Section: "+ this.section);
		System.out.println("Student Contact: "+ Long.parseLong(this.phone_no));
	}
	
	

	public static void main(String[] args) {
		
		StudentInfo obj = new StudentInfo();
		obj.setinfo("Roushan", "2072051", "A", "8677867330");
		obj.getInfo();

	}

}
