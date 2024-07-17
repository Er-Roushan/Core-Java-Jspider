package projectimplementation;
import java.util.Scanner;
import technicalevents.TechnicalEvents;
import gamingevents.GamingEvents;
import offstageevents.OffStageEvents;
import onstageevents.OnStageEvents;
import starperfomance.StarPerformance;


public class Implementation {

	public static void main(String[] args) {
		
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Welcome to Event Info System.........");
		System.out.println("\nChoose the type of Events:-");
		System.out.println("\t1:For Technical Events \n\t2:For Gaming Events \n\t3:For On Stage Events \n\t4:For Off Stage Events \n\t5:For StarCast/Movie Promo Events \n\t6:for Exit  ");
		System.out.print("\nEnter the Option Here: ");
		int option = obj.nextInt();		
		
		boolean flag = true;

		
		do {
			
			switch(option) {
			
			case 1:
					TechnicalEvents.techEvents();
					boolean inner_flag = true;
					
					System.out.print("\n\n\tIf you want to register yourself in any of technical Event Enter--->1\n\tIf you want to get info about other types of event Enter --->2");
					int inner_option = obj.nextInt();
					
					if(inner_option == 1) {
						
						System.out.print("Enter the respective option in which technical event you want to register: ");
						System.out.print("\n\t1.for Comptetive-Coding \n\t2.for Technical Quiz \n\t3.Web Warriors \n\t4.Bug-Debug");
						int switch_key = obj.nextInt();
						do {
							
							switch (switch_key) {
							case 1: 
								TechnicalEvents.regTechEvent1();
								System.out.print("Do you want to register yourself in more technical events, enter respective option or enter 5 to go to main menu: ");
								switch_key = obj.nextInt();
								
								break;
							case 2:
								TechnicalEvents.regTechEvent2();
								System.out.print("Do you want to register yourself in more technical events, enter respective option or enter 5 to go to main menu: ");
								switch_key = obj.nextInt();
								
							break;
							
							case 3:
								TechnicalEvents.regTechEvent3();
								System.out.print("Do you want to register yourself in more technical events, enter respective option or enter 5 to go to main menu: ");
								switch_key = obj.nextInt();
								
							break;
							
							case 4:
								TechnicalEvents.regTechEvent4();
								System.out.print("Do you want to register yourself in more technical events, enter respective option or enter 5 to go to main menu: ");
								switch_key = obj.nextInt();								
							break;
							
							case 5:
								inner_flag = false;
								System.out.println("\nChoose the type of Events:-");
								System.out.println("\t1:For Technical Events \n\t2:For Gaming Events \n\t3:For On Stage Events \n\t4:For Off Stage Events \n\t5:For StarCast/Movie Promo Events \n\t6:for Exit  ");
						
								System.out.print("\nEnter the Type of Event to know about or press 6 to exit the system: ");
								option = obj.nextInt();
								break;
								
							}
						} while (inner_flag);
						
					}
					else
					{
						System.out.println("\nChoose the type of Events:-");
						System.out.println("\t1:For Technical Events \n\t2:For Gaming Events \n\t3:For On Stage Events \n\t4:For Off Stage Events \n\t5:For StarCast/Movie Promo Events \n\t6:for Exit  ");
					
						System.out.print("Enter the Type of Event: ");
						option = obj.nextInt();
					}
					break;
					
			case 2:
					GamingEvents.gamingEvents();
					boolean g_inner_flag = true;
					
					System.out.print("\n\n\tIf you want to register yourself in any of Gaming Event Enter--->1\n\tIf you want to get info about other types of event Enter --->2");
					int g_inner_option = obj.nextInt();
					
					if(g_inner_option == 1) {
						
						System.out.print("Enter the respective option in which gaming event you want to register: ");
						System.out.print("\n\t1.for BGMI Squad Battle \n\t2.for BGMI Duo Battle \n\t3.for FF Squad Battle \n\t4.for COD");
						int switch_key = obj.nextInt();
						do {
							
							switch (switch_key) {
							case 1: 
								GamingEvents.regGamingEvent1();
								System.out.print("Do you want to register yourself in more gaming events, enter respective option or enter 5 to go to main menu: ");
								switch_key = obj.nextInt();
								
								break;
							case 2:
								GamingEvents.regGamingEvent2();
								System.out.print("Do you want to register yourself in more gaming events, enter respective option or enter 5 to go to main menu: ");
								switch_key = obj.nextInt();
								
							break;
							
							case 3:
								GamingEvents.regGamingEvent3();
								System.out.print("Do you want to register yourself in more gaming events, enter respective option or enter 5 to go to main menu: ");
								switch_key = obj.nextInt();
								
							break;
							
							case 4:
								GamingEvents.regGamingEvent4();
								System.out.print("Do you want to register yourself in more gaming events, enter respective option or enter 5 to go to main menu: ");
								switch_key = obj.nextInt();
								
							break;
							
							case 5:
								g_inner_flag = false;
								System.out.println("\nChoose the type of Events:-");
								System.out.println("\t1:For Technical Events \n\t2:For Gaming Events \n\t3:For On Stage Events \n\t4:For Off Stage Events \n\t5:For StarCast/Movie Promo Events \n\t6:for Exit  ");
							
								System.out.print("\nEnter the Type of Event to know about or press 6 to exit the system: ");
								option = obj.nextInt();
								break;
								
							}
						} while (g_inner_flag);
						
					}
					else
					{	
						
						System.out.println("\nChoose the type of Events:-");
						System.out.println("\t1:For Technical Events \n\t2:For Gaming Events \n\t3:For On Stage Events \n\t4:For Off Stage Events \n\t5:For StarCast/Movie Promo Events \n\t6:for Exit  ");
					
						System.out.print("Enter the Type of Event: ");
						option = obj.nextInt();
					}
					break;
					
				
			case 3:
					OnStageEvents.onStageEvents();
					boolean ons_inner_flag = true;
					
					System.out.print("\n\n\tIf you want to register yourself in any of on-stage Event Enter--->1\n\tIf you want to get info about other types of event Enter --->2");
					int ons_inner_option = obj.nextInt();
					
					if(ons_inner_option == 1) {
						
						System.out.print("Enter the respective option in which on-stage event you want to register: ");
						System.out.print("\n\t1.for Group Dance Battle \n\t2.for Solo Dance Battle \n\t3.for Singing \n\t4.For Modeling");
						int switch_key = obj.nextInt();
						do {
							
							switch (switch_key) {
							case 1: 
								OnStageEvents.regOnStageEvent1();
								System.out.print("Do you want to register yourself in more on-stage events, enter respective option or enter 5 to go to main menu: ");
								switch_key = obj.nextInt();
								
								break;
							case 2:
								OnStageEvents.regOnStageEvent2();
								System.out.print("Do you want to register yourself in more on-stage events, enter respective option or enter 5 to go to main menu: ");
								switch_key = obj.nextInt();
								
							break;
							
							case 3:
								OnStageEvents.regOnStageEvent3();
								System.out.print("Do you want to register yourself in more on-stage events, enter respective option or enter 5 to go to main menu: ");
								switch_key = obj.nextInt();
								
							break;
							
							case 4:
								OnStageEvents.regOnStageEvent4();
								System.out.print("Do you want to register yourself in more on-stage events, enter respective option or enter 5 to go to main menu: ");
								switch_key = obj.nextInt();
								
							break;
							
							case 5:
								ons_inner_flag = false;
								System.out.println("\nChoose the type of Events:-");
								System.out.println("\t1:For Technical Events \n\t2:For Gaming Events \n\t3:For On Stage Events \n\t4:For Off Stage Events \n\t5:For StarCast/Movie Promo Events \n\t6:for Exit  ");
								System.out.print("\nEnter the Type of Event to know about or press 6 to exit the system: ");
								option = obj.nextInt();
								break;
								
							}
						} while (ons_inner_flag);
						
					}
					else
					{	
						
						System.out.println("\nChoose the type of Events:-");
						System.out.println("\t1:For Technical Events \n\t2:For Gaming Events \n\t3:For On Stage Events \n\t4:For Off Stage Events \n\t5:For StarCast/Movie Promo Events \n\t6:for Exit  ");
					
						System.out.print("Enter the Type of Event: ");
						option = obj.nextInt();
					}
					break;
				
			case 4:
					OffStageEvents.offStageEvents();
					boolean ofs_inner_flag = true;
					
					System.out.print("\n\n\tIf you want to register yourself in any of off-stage Event Enter--->1\n\tIf you want to get info about other types of event Enter --->2");
					int ofs_inner_option = obj.nextInt();
					
					if(ofs_inner_option == 1) {
						
						System.out.print("Enter the respective option in which off-stage event you want to register: ");
						System.out.print("\n\t1.for Mehandi \n\t2.for Rangoli \n\t3.for Food Without Fire  \n\t4.for 15-Min Makeup");
						int switch_key = obj.nextInt();
						do {
							
							switch (switch_key) {
							case 1: 
								OffStageEvents.regOffStageEvent1();
								System.out.print("Do you want to register yourself in more off-stage events, enter respective option or enter 5 to go to main menu: ");
								switch_key = obj.nextInt();
								
								break;
							case 2:
								OffStageEvents.regOffStageEvent2();
								System.out.print("Do you want to register yourself in more off-stage events, enter respective option or enter 5 to go to main menu: ");
								switch_key = obj.nextInt();
								
							break;
							
							case 3:
								OffStageEvents.regOffStageEvent3();
								System.out.print("Do you want to register yourself in more off-stage events, enter respective option or enter 5 to go to main menu: ");
								switch_key = obj.nextInt();
								
							break;
							
							case 4:
								OffStageEvents.regOffStageEvent4();
								System.out.print("Do you want to register yourself in more off-stage events, enter respective option or enter 5 to go to main menu: ");
								switch_key = obj.nextInt();
								
							break;
							
							case 5:
								ofs_inner_flag = false;
								System.out.println("\nChoose the type of Events:-");
								System.out.println("\t1:For Technical Events \n\t2:For Gaming Events \n\t3:For On Stage Events \n\t4:For Off Stage Events \n\t5:For StarCast/Movie Promo Events \n\t6:for Exit  ");

								System.out.print("\nEnter the Type of Event to know about or press 6 to exit the system: ");
								option = obj.nextInt();
								break;
								
							}
						} while (ofs_inner_flag);
						
					}
					else
					{	
						
						System.out.println("\nChoose the type of Events:-");
						System.out.println("\t1:For Technical Events \n\t2:For Gaming Events \n\t3:For On Stage Events \n\t4:For Off Stage Events \n\t5:For StarCast/Movie Promo Events \n\t6:for Exit  ");
					
						System.out.print("Enter the Type of Event: ");
						option = obj.nextInt();
					}
					break;
				
			case 5:
					StarPerformance.starPerformance();
					System.out.print("\n\nDo you want to get info about other types of event. if Yes!!! Then enter respective option else enter 6 to exit the system....... ");
					option = obj.nextInt();
					break;
			
			case 6:
				System.out.println("\nThank You.\nStuy Tuned and Connected for more info...For more details contact Roushan Kumar");
				flag=false;
				break;
				
			default:
				
				System.out.println("Please Enter a valid option(1-6)");
				System.out.print("Enter again: ");
				option = obj.nextInt();
				if(option<1 || option>6) {
					System.out.println("Sorry you are not entering a valid option Please Try another time...");
					option = 6;
				} //end of default if
				
			 
			}//end of outer switch
			
		} while (flag);
		
		obj.close();
	} //end of main method

}// end of class
