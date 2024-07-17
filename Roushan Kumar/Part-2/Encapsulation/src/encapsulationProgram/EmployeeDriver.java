package encapsulationProgram;

public class EmployeeDriver {

	public static void main(String[] args) {
		Employee obj = new Employee("Roushan Kumar", 50000.12, 2072051, "18-June-2000", "Qspiders" );
		
		System.out.println(obj.getEname());
		System.out.println(obj.getSalary());
		System.out.println(obj.getEid());
		System.out.println(obj.getJoining_date());
		System.out.println(obj.getCname());
		
		//setter
//		obj.setSalary(50000.12);
		obj.setSalary(100000);
		System.out.println("Updated Salary is: " + obj.getSalary());
	}

}
