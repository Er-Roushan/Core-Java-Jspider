package gamingevents;
import java.util.Scanner;
public class GamingEvents {
	
	static Scanner obj= new Scanner(System.in);
public static void gamingEvents() {
		
		System.out.println("Event Name: BGMI Squad Battle");
		System.out.println("	Entry Fee: Rs 200");
		System.out.println("	Deadline to register: 8-April-2024");
		System.out.println("	Team Member: 4");
		System.out.println("	Team Register Till: 40");
		System.out.println("	Venue: Indoor Stadium, G-Block");
		System.out.println("	Date: 10-April-2024");
		System.out.println("	Timing: 10:00-12:00 AM");
		System.out.println("	Event Co-ordinator:Mritunjay Chd");
		System.out.println("		Contact No: 8677867330");
		System.out.println("	Click for Events Rule Book");
		System.out.println();
		System.out.println("-------Click Here To Register In BGMI Squad Battle Event-------");
		
		
		System.out.println("\n\nEvent Name: BGMI Duo Battle ");
		System.out.println("	Entry Fee: 100");
		System.out.println("	Deadline to register: 20-April-2024");
		System.out.println("	Team Member: 2");
		System.out.println("	Team Register Till: 26");
		System.out.println("	Venue: Indoor Stadium, G-Block");
		System.out.println("	Date: 21-April-2024");
		System.out.println("	Timing: 10:00-12:00 AM");
		System.out.println("	Event Co-ordinator:Sonu Kumar");
		System.out.println("		Contact No: 8677867330");
		System.out.println("	Click for Events Rule Book");
		System.out.println();
		System.out.println("-------Click Here To Register In BGMI Duo Battle Event-------");
		
		System.out.println("\n\nEvent Name: Free Fire Squad Battle");
		System.out.println("	Entry Fee: 400");
		System.out.println("	Deadline to register: 20-April-2024");
		System.out.println("	Team Member: 4");
		System.out.println("	Team Register Till: 35");
		System.out.println("	Venue: Indoor Stadium, G-Block");
		System.out.println("	Date: 22-April-2024");
		System.out.println("	Timing: 10:00-12:00 AM");
		System.out.println("	Event Co-ordinator:Abhishek Kumar");
		System.out.println("		Contact No: 8677867330");
		System.out.println("	Click for Events Rule Book");
		System.out.println();
		System.out.println("-------Click Here To Register In Free Fire Squad Battle Event-------");
		
		

		System.out.println("\n\nEvent Name: COD");
		System.out.println("	Entry Fee: 200");
		System.out.println("	Deadline to register: 25-April-2024");
		System.out.println("	Team Member: 4");
		System.out.println("	Team Register Till: 14");
		System.out.println("	Venue: Indoor Stadium, G-Block");
		System.out.println("	Date: 23-April-2024");
		System.out.println("	Timing: 10:00-12:00 AM");
		System.out.println("	Event Co-ordinator:Jigmet Stanzin");
		System.out.println("		Contact No: 8677867330");
		System.out.println("	Click for Events Rule Book");
		System.out.println();
		System.out.println("-------Click Here To Register In COD Event-------");
		
		
		System.out.println("\n\nStay Connected for more upcoming Gaming events...For more query contact Gaming Events Head: Roushan Kumar(8677867330)");
		
		
	}
	
	public static void regGamingEvent1() {
	
		obj.nextLine();
		System.out.print("Enter Team Lead name: ");
		String name = obj.nextLine();
	
		System.out.print("Enter Team Lead uid: ");
		int uid=obj.nextInt();
	
		System.out.println("Team Lead name: " + name);
		System.out.println("UID: " + uid);
		System.out.println("Successfully Registered in BGMI Squad Battle event..");
	
	
	}
	public static void regGamingEvent2() {
	
		obj.nextLine();
		System.out.print("Enter Team Lead name: ");
		String name = obj.nextLine();
		
		System.out.print("Enter Team Lead uid: ");
		int uid=obj.nextInt();
		
		System.out.println("Team Lead name: " + name);
		System.out.println("UID: " + uid);
		System.out.println("Successfully Registered in BGMI Duo Battle event..");
		
		
		
	}
	
	public static void regGamingEvent3() {
		
		obj.nextLine();
		System.out.print("Enter Team Lead name: ");
		String name = obj.nextLine();
		
		System.out.print("Enter Team Lead uid: ");
		int uid=obj.nextInt();
		
		System.out.println("Team Lead name: " + name);
		System.out.println("UID: " + uid);
		System.out.println("Successfully Registered in Free Fire Squad Battle event..");	
		
		
	}
	
	public static void regGamingEvent4() {
	
		obj.nextLine();
		System.out.print("Enter Team Lead name: ");
		String name = obj.nextLine();
		
		System.out.print("Enter Team Lead uid: ");
		int uid=obj.nextInt();
		
		System.out.println("Team Lead name: " + name);
		System.out.println("UID: " + uid);
		System.out.println("Successfully Registered in COD event..");
		
		
	}
}
