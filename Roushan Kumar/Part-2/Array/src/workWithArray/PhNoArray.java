package workWithArray;

import java.util.Scanner;

public class PhNoArray {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		long[] phone_number = new long[3];
		
		// To store the value inside the array
		
		for(int i=0; i<phone_number.length; i++) {
			System.out.print("Enter the "+ (i+1) + " phone_number No: ");
			phone_number[i]= obj.nextLong();
		}
		
		System.out.println("=================");
		
		//for printing the reference
		System.out.println("Reference is: "+ phone_number);
		
		System.out.println("=================");
		
		// For no of elements in the array
		System.out.println("No of element in array is: "+phone_number.length);
		
		System.out.println("=================");
		
		//printing by help of index value
		System.out.println("Ist phone_number No is: " + phone_number[0]);
		System.out.println("2nd phone_number No is: " + phone_number[1]);
		System.out.println("3rd phone_number No is: " + phone_number[2]);

		
		
		System.out.println("=================");
		
		System.out.println("\nIn forward direction using for loop........");
	//for accessing the value in forward direction using for loop
	for(int i=0; i<phone_number.length; i++) {
		System.out.println("Entered value at  " + i + " index is: " + phone_number[i]);
		
		}
	
	System.out.println("\nIn Backward direction using for loop.........");
	//for accessing the value in backward direction using for loop
	for(int i=phone_number.length-1; i>=0; i--) {
		System.out.println("Entered value at  " + i + " index is: " + phone_number[i]);
		
		}
	
	System.out.println("=================");
	
	System.out.println("\nIn forward direction using while loop........");
	//for accessing the value in forward direction using while loop
	int k=0;
	while(k<phone_number.length){
		System.out.println("Entered value at  " + k + " index is: " + phone_number[k]);
		k++;
	}
	
	System.out.println("\nIn backward direction using while loop........");
	//for accessing the value in Backward direction using while loop
		k=phone_number.length-1;
	while( k>=0){
		System.out.println("Entered value at  " + k + " index is: " + phone_number[k]);
		k--;
	}
	
	System.out.println("=================");
	
	System.out.println("\nIn forward direction using do-while loop........");
	//for accessing the value in forward direction using do-while loop
	 k=0;
	 do {
		 System.out.println("Entered value at  " + k + " index is: " + phone_number[k]);
		 k++;
	} while (k<phone_number.length);
	 
	 
	 System.out.println("\nIn backward direction using do-while loop........");
		//for accessing the value in backward direction using do-while loop
		 k=phone_number.length - 1;
		 do {
			 System.out.println("Entered value at  " + k + " index is: " + phone_number[k]);
			 k--;
		} while (k>=0);
		
		obj.close();
	}

}
