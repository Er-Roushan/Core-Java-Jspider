package technicalevents;
import java.util.Scanner;
public class TechnicalEvents {
	
	static Scanner obj= new Scanner(System.in);
	public static void techEvents() {
		
		System.out.println("Event Name: Competetive-Coding");
		System.out.println("	Entry Fee: Rs 200");
		System.out.println("	Deadline to register: 10-April-2024");
		System.out.println("	Team Member: 1-4");
		System.out.println("	Team Register Till: 10");
		System.out.println("	Venue: AI Lab-IV, E-Block");
		System.out.println("	Date: 12-April-2024");
		System.out.println("	Timing: 10:00-11:00 AM");
		System.out.println("	Event Co-ordinator:Roushan Kumar");
		System.out.println("		Contact No: 8677867330");
		System.out.println("	Click for Events Rule Book");
		System.out.println();
		System.out.println("-------Click Here To Register In Competetive-coding Event-------");
		
		
		System.out.println("\n\nEvent Name: Technical Quiz");
		System.out.println("	Entry Fee: Free");
		System.out.println("	Deadline to register: 15-April-2024");
		System.out.println("	Team Member: 1-2");
		System.out.println("	Team Register Till: 6");
		System.out.println("	Venue: Seminar Hall, E-Block");
		System.out.println("	Date: 18-April-2024");
		System.out.println("	Timing: 10:00-11:00 AM");
		System.out.println("	Event Co-ordinator:Sonu Kumar");
		System.out.println("		Contact No: 8677867330");
		System.out.println("	Click for Events Rule Book");
		System.out.println();
		System.out.println("-------Click Here To Register In Technical Quiz Event-------");
		
		
		System.out.println("\n\nEvent Name: Web Warriors");
		System.out.println("	Entry Fee: Free");
		System.out.println("	Deadline to register: 17-April-2024");
		System.out.println("	Team Member: 1");
		System.out.println("	Team Register Till: 15");
		System.out.println("	Venue: Seminar Hall, F-Block");
		System.out.println("	Date: 20-April-2024");
		System.out.println("	Timing: 10:00-11:00 AM");
		System.out.println("	Event Co-ordinator:Abhishek Kumar");
		System.out.println("		Contact No: 8677867330");
		System.out.println("	Click for Events Rule Book");
		System.out.println();
		System.out.println("-------Click Here To Register In Web Warriors Event-------");
		
		
		System.out.println("\n\nEvent Name: Bug-Debug");
		System.out.println("	Entry Fee: Free");
		System.out.println("	Deadline to register: 25-April-2024");
		System.out.println("	Team Member: 4");
		System.out.println("	Team Register Till: 4");
		System.out.println("	Venue: Lab Section, E-Block");
		System.out.println("	Date: 30-April-2024");
		System.out.println("	Timing: 10:00-11:00 AM");
		System.out.println("	Event Co-ordinator:Jigmet Stanzin");
		System.out.println("		Contact No: 8677867330");
		System.out.println("	Click for Events Rule Book");
		System.out.println();
		System.out.println("-------Click Here To Register In Bug-Debug Event-------");
		
		
		System.out.println("\n\nStay Connected for more upcoming technical events...For more query contact Technical Events Head: Roushan Kumar(8677867330)");
		
		
		
		
		
	}
	
	public static void regTechEvent1()
	{
		
		obj.nextLine();
		System.out.print("Enter Team Lead name: ");
		String name = obj.nextLine();
		
		System.out.print("Enter Team Lead uid: ");
		int uid=obj.nextInt();
		
		System.out.println("Team Lead name: " + name);
		System.out.println("UID: " + uid);
		System.out.println("Successfully Registered in Competetive Coding event..");
	}
	public static void regTechEvent2() {
		
		obj.nextLine();
		System.out.print("Enter Team Lead name: ");
		String name = obj.nextLine();
		
		System.out.print("Enter Team Lead uid: ");
		int uid=obj.nextInt();
		
		System.out.println("Team Lead name: " + name);
		System.out.println("UID: " + uid);
		System.out.println("Successfully Registered in Technical quiz..");
		
	}
	
	public static void regTechEvent3() {
		
		obj.nextLine();
		System.out.print("Enter Team Lead name: ");
		String name = obj.nextLine();
		
		System.out.print("Enter Team Lead uid: ");
		int uid=obj.nextInt();
		
		System.out.println("Team Lead name: " + name);
		System.out.println("UID: " + uid);
		System.out.println("Successfully Registered in web warriors..");
		
	}
	
	public static void regTechEvent4() {
		obj.nextLine();
		System.out.print("Enter Team Lead name: ");
		String name = obj.nextLine();
		
		System.out.print("Enter Team Lead uid: ");
		int uid=obj.nextInt();
		
		System.out.println("Team Lead name: " + name);
		System.out.println("UID: " + uid);
		System.out.println("Successfully Registered in Bug-Debug..");
		
	}

}
