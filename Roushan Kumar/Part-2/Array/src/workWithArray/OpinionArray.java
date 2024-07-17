package workWithArray;

import java.util.Scanner;

public class OpinionArray {

	public static void main(String[] args) {
Scanner obj = new Scanner(System.in);
		
		String temp1 = "yes";
		
		boolean[] opinion = new boolean[7];
		
		// To store the value inside the array
		
		for(int i=0; i<opinion.length; i++) {
			System.out.print("Enter the "+ (i+1) + " opinion: ");
			
			String temp= obj.nextLine();
			
			if(temp.equals(temp1)){
				opinion[i] = true;
			}else {
				opinion[i]=false;
			}
		}
		
		System.out.println("=================");
		
		//for printing the reference
		System.out.println("Reference is: "+ opinion);
		
		System.out.println("=================");
		
		// For no of elements in the array
		System.out.println("\nNo of element in array is: "+opinion.length);
		
		System.out.println("=================");
		
		//printing by help of index value
		System.out.println("1st opinion is: " + opinion[0]);
		System.out.println("2nd opinion is: " + opinion[1]);
		System.out.println("3rd opinion is: " + opinion[2]);
		System.out.println("4th opinion is: " + opinion[3]);
		System.out.println("5th opinion is: " + opinion[4]);
		System.out.println("6th opinion is: " + opinion[5]);
		System.out.println("7th opinion is: " + opinion[6]);

		
		
		System.out.println("=================");
		
		System.out.println("\nIn forward direction using for loop........");
	//for accessing the value in forward direction using for loop
	for(int i=0; i<opinion.length; i++) {
		System.out.println("Entered value at  " + i + " index is: " + opinion[i]);
		
		}
	
	System.out.println("\nIn Backward direction using for loop.........");
	//for accessing the value in backward direction using for loop
	for(int i=opinion.length-1; i>=0; i--) {
		System.out.println("Entered value at  " + i + " index is: " + opinion[i]);
		
		}
	
	System.out.println("=================");
	
	System.out.println("\nIn forward direction using while loop........");
	//for accessing the value in forward direction using while loop
	int k=0;
	while(k<opinion.length){
		System.out.println("Entered value at  " + k + " index is: " + opinion[k]);
		k++;
	}
	
	System.out.println("\nIn backward direction using while loop........");
	//for accessing the value in Backward direction using while loop
		k=opinion.length-1;
	while( k>=0){
		System.out.println("Entered value at  " + k + " index is: " + opinion[k]);
		k--;
	}
	
	System.out.println("=================");
	
	System.out.println("\nIn forward direction using do-while loop........");
	//for accessing the value in forward direction using do-while loop
	 k=0;
	 do {
		 System.out.println("Entered value at  " + k + " index is: " + opinion[k]);
		 k++;
	} while (k<opinion.length);
	 
	 
	 System.out.println("\nIn backward direction using do-while loop........");
		//for accessing the value in backward direction using do-while loop
		 k=opinion.length - 1;
		 do {
			 System.out.println("Entered value at  " + k + " index is: " + opinion[k]);
			 k--;
		} while (k>=0);
		
		obj.close();
	}

}
