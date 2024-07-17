package encapsulationProgram;

public class Student {
	


	private String name;
	private long phno;
	private int rollno;
	private int mark;
	private String college_name;
	private long addhar_no;
	
	public Student(String name, long phno, int rollno, int mark, String college_name, long addhar_no) {
		
		this.name = name;
		this.phno = phno;
		this.rollno = rollno;
		this.mark = mark;
		this.college_name = college_name;
		this.addhar_no = addhar_no;
	}

	public String getName() {
		return name;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		if(this.phno == phno) {
			System.out.println("invalid..New phone no should not match with old ones.");
		}else {
			this.phno = phno;
		}
	}

	public int getRollno() {
		return rollno;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		if(this.mark == mark) {
			System.out.println("Invalid New Mark should not be same with old ones.");
		}else {
			this.mark = mark;
		}
	}

	public String getCollege_name() {
		return college_name;
	}

//	public static void main(String[] args) {
//		
//	}

}
