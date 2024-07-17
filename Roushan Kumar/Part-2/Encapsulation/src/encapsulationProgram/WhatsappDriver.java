package encapsulationProgram;

public class WhatsappDriver {

	public static void main(String[] args) {
		Whatsapp obj = new Whatsapp(8677867330l, "Active", "Hey! i'm using whatsapp.");
		
		System.out.println(obj.getPhno());
		System.out.println(obj.getStatus());
		System.out.println(obj.getBio());
		
		System.out.println();
		
		//Setter
		
		//obj.setPhno(8677867330l);
		obj.setPhno(6207668189l);
		System.out.println("Updated Phone No: " + obj.getPhno());
		
//		obj.setStatus("Active");
		obj.setStatus("Offline");
		System.out.println("Updated Status: " + obj.getStatus());
		
//		obj.setBio("Hey! i'm using whatsapp.");
		obj.setBio("You have to be odd to be no one.");
		System.out.println("Updated Bio: " + obj.getBio());
	

	}

}
