package onstageevents;
import java.util.Scanner;


public class OnStageEvents {

	static Scanner obj = new Scanner(System.in);
	
	
public static void onStageEvents() {
		
		System.out.println("Event Name: Group Dance Battle");
		System.out.println("	Entry Fee: Rs 500");
		System.out.println("	Deadline to register: 8-April-2024");
		System.out.println("	Team Member: 1");
		System.out.println("	Team Register Till: 40");
		System.out.println("	Venue: Main Auditorium");
		System.out.println("	Date: 10-April-2024");
		System.out.println("	Timing: 10:00-12:00 AM");
		System.out.println("	Event Co-ordinator:Nikita Nimmy");
		System.out.println("		Contact No: 8677867330");
		System.out.println("	Click for Events Rule Book");
		System.out.println();
		System.out.println("-------Click Here To Register In Group Dance Battle Event-------");
		

		System.out.println("\n\nEvent Name: Solo Dance Competetion ");
		System.out.println("	Entry Fee: 100");
		System.out.println("	Deadline to register: 20-April-2024");
		System.out.println("	Team Member: 2");
		System.out.println("	Team Register Till: 26");
		System.out.println("	Venue: Main Auditorium");
		System.out.println("	Date: 21-April-2024");
		System.out.println("	Timing: 10:00-12:00 AM");
		System.out.println("	Event Co-ordinator:Komal Kumar");
		System.out.println("		Contact No: 8677867330");
		System.out.println("	Click for Events Rule Book");
		System.out.println();
		System.out.println("-------Click Here To Register In Solo Dance Event-------");
		
		System.out.println("\n\nEvent Name: Singing");
		System.out.println("	Entry Fee: Free");
		System.out.println("	Deadline to register: 20-April-2024");
		System.out.println("	Team Member: No Limit");
		System.out.println("	Team Register Till: 10");
		System.out.println("	Venue: Concert Hall");
		System.out.println("	Date: 22-April-2024");
		System.out.println("	Timing: 10:00-04:00 PM");
		System.out.println("	Event Co-ordinator:Preeti Jangra");
		System.out.println("		Contact No: 8677867330");
		System.out.println("	Click for Events Rule Book");
		System.out.println();
		System.out.println("-------Click Here To Register In Singing Event-------");
		
		System.out.println("\n\nEvent Name: Modeling");
		System.out.println("	Entry Fee: 400");
		System.out.println("	Deadline to register: 25-April-2024");
		System.out.println("	Team Member: 1");
		System.out.println("	Team Register Till: 14");
		System.out.println("	Venue: Auditorium");
		System.out.println("	Date: 23-April-2024");
		System.out.println("	Timing: 10:00-12:00 AM");
		System.out.println("	Event Co-ordinator:Puteeth Stanzin");
		System.out.println("		Contact No: 8677867330");
		System.out.println("	Click for Events Rule Book");
		System.out.println();
		System.out.println("-------Click Here To Register In Modeling Event-------");
		
		
		System.out.println("\n\nStay Connected for more upcoming Onstage events...For more query contact Gaming Events Head: Roushan Kumar(8677867330)");
		
		
		
	}

public static void regOnStageEvent1() {
	obj.nextLine();
	System.out.print("Enter Team Lead name: ");
	String name = obj.nextLine();

	System.out.print("Enter Team Lead uid: ");
	int uid=obj.nextInt();

	System.out.println("Team Lead name: " + name);
	System.out.println("UID: " + uid);
	System.out.println("Successfully Registered in Group Dance event..");
	
}
	
	public static void regOnStageEvent2() {
	
		obj.nextLine();
		System.out.print("Enter Performer name: ");
		String name = obj.nextLine();
		
		System.out.print("Enter performer uid: ");
		int uid=obj.nextInt();
		
		System.out.println("Performer name: " + name);
		System.out.println("UID: " + uid);
		System.out.println("Successfully Registered in Solo Dance event..");
		
		
		
	}
	
	public static void regOnStageEvent3() {
		
		obj.nextLine();
		System.out.print("Enter Performer name: ");
		String name = obj.nextLine();
		
		System.out.print("Enter Performer uid: ");
		int uid=obj.nextInt();
		
		System.out.println("Performer name: " + name);
		System.out.println("UID: " + uid);
		System.out.println("Successfully Registered in Singing event..");	
		
	}
	
	public static void regOnStageEvent4() {
		
		obj.nextLine();
		System.out.print("Enter Performer name: ");
		String name = obj.nextLine();
		
		System.out.print("Enter Performer UID: ");
		int uid=obj.nextInt();
		
		System.out.println("Enter Performer name: " + name);
		System.out.println("UID: " + uid);
		System.out.println("Successfully Registered in Modeling event..");
		
		
	}
	
}
