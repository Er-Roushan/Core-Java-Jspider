package encapsulationProgram;

public class Whatsapp {
	
	private long phno;
	private String status;
	private String bio;
	
	public Whatsapp(long phno, String status, String bio) {
		super();
		this.phno = phno;
		this.status = status;
		this.bio = bio;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		if(this.phno == phno) {
			System.out.println("Invalid..New phone no should not same with old ones.");
		}else {
			this.phno = phno;
		}
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		if(this.status == status) {
			System.out.println("Invalid..New Status should not same with old ones.");
		}else {
			this.status = status;
		}
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		if(this.bio == bio) {
			System.out.println("Invalid.. New Bio should not same with the old ones");
		}
	}
	
}
