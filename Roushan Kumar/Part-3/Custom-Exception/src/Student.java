
public class Student {
	
	private String name;
	private int roll;

	public Student(String name, int roll) {
	
		this.name = name;
		this.roll = roll;
	}

		
	public void getName(int roll) {
		if(this.roll == roll) {
			System.out.println("Name: " + this.name);
		}else
		{
			try {
				throw new InvalidPwd();
			}
			catch(InvalidPwd obj) {
				System.out.println(obj.getMessage());
				obj.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student sobj = new Student("Roushan Kumar", 1);
		sobj.getName(67);
		
		System.out.println("Hello");

	}

}
