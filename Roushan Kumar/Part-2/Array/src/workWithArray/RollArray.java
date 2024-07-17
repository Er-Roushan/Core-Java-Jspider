package workWithArray;

import java.util.Scanner;
public class RollArray {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		int[] roll = new int[7];
		
		// To store the value inside the array
		
		for(int i=0; i<roll.length; i++) {
			System.out.print("Enter the "+ (i+1) + " Roll No: ");
			roll[i]= obj.nextInt();
		}
		
		System.out.println("=================");
		
		//for printing the reference
		System.out.println("Reference is: "+ roll);
		
		System.out.println("=================");
		
		// For no of elements in the array
		System.out.println("\nNo of element in array is: "+roll.length);
		
		System.out.println("=================");
		
		//printing by help of index value
		System.out.println("Ist Roll No is: " + roll[0]);
		System.out.println("2nd Roll No is: " + roll[1]);
		System.out.println("3rd Roll No is: " + roll[2]);
		System.out.println("4th Roll No is: " + roll[3]);
		System.out.println("5th Roll No is: " + roll[4]);
		System.out.println("6th Roll No is: " + roll[5]);
		System.out.println("7th Roll No is: " + roll[6]);
		
		
		System.out.println("=================");
		
		System.out.println("\nIn forward direction using for loop........");
	//for accessing the value in forward direction using for loop
	for(int i=0; i<roll.length; i++) {
		System.out.println("Entered value at  " + i + " index is: " + roll[i]);
		
		}
	
	System.out.println("\nIn Backward direction using for loop.........");
	//for accessing the value in backward direction using for loop
	for(int i=roll.length-1; i>=0; i--) {
		System.out.println("Entered value at  " + i + " index is: " + roll[i]);
		
		}
	
	System.out.println("=================");
	
	System.out.println("\nIn forward direction using while loop........");
	//for accessing the value in forward direction using while loop
	int k=0;
	while(k<roll.length){
		System.out.println("Entered value at  " + k + " index is: " + roll[k]);
		k++;
	}
	
	System.out.println("\nIn backward direction using while loop........");
	//for accessing the value in Backward direction using while loop
		k=roll.length-1;
	while( k>=0){
		System.out.println("Entered value at  " + k + " index is: " + roll[k]);
		k--;
	}
	
	System.out.println("=================");
	
	System.out.println("\nIn forward direction using do-while loop........");
	//for accessing the value in forward direction using do-while loop
	 k=0;
	 do {
		 System.out.println("Entered value at  " + k + " index is: " + roll[k]);
		 k++;
	} while (k<roll.length);
	 
	 
	 System.out.println("\nIn backward direction using do-while loop........");
		//for accessing the value in backward direction using do-while loop
		 k=roll.length - 1;
		 do {
			 System.out.println("Entered value at  " + k + " index is: " + roll[k]);
			 k--;
		} while (k>=0);
		
		obj.close();
	}

}
