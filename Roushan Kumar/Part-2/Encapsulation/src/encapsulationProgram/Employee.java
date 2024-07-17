package encapsulationProgram;

public class Employee {

		private String Ename;
		private double salary;
		private int eid;
		private String joining_date;
		private String cname;
		
		public Employee(String ename, double salary, int eid, String joining_date, String cname) {
			super();
			Ename = ename;
			this.salary = salary;
			this.eid = eid;
			this.joining_date = joining_date;
			this.cname = cname;
		}

		public String getEname() {
			return Ename;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			if(this.salary == salary) {
				System.out.println("Invalid..New Salary value should not same with the old ones.");
			}else {
				this.salary = salary;
			}
		}

		public int getEid() {
			return eid;
		}

		public String getJoining_date() {
			return joining_date;
		}

		public String getCname() {
			return cname;
		}

		
}
