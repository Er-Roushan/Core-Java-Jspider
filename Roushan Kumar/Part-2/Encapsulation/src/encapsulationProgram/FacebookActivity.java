package encapsulationProgram;

public class FacebookActivity {
	
	private String user_name;
	private String user_id;
	private int password;
	
	FacebookActivity(String user_name, String user_id, int password){
		this.user_name = user_name;
		this.user_id = user_id;
		this.password=password;
	}
	
	public void setName(String name) {
		this.user_name=name;
	}
	
//	public void setUId(int uid) {
//		this.user_id=uid;
//	}
//	
	public  void setPassword(int password) {
		this.password=password;
	}

	public String getName() {
		
		return user_name;
	}
	
	public String getUId() {
		return user_id;
	}
	
//	public int getPassword() {
//		return password;
//	}
	public static void main(String[] args) {
		
		FacebookActivity obj = new FacebookActivity("aman kumar", "Roushan@124", 78945);
		obj.setName("Roushan Kumar");
		
		obj.setPassword(1234);
		
		System.out.println(obj.getName());
		System.out.println(obj.getUId());
		
	}

}
