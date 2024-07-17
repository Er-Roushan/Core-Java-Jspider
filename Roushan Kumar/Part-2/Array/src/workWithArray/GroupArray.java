package workWithArray;

import java.util.Scanner;

public class GroupArray {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		char[] group = new char[8];
		
		// To store the value inside the array
		
		for(int i=0; i<group.length; i++) {
			System.out.print("Enter the "+ (i+1) + " group: ");
			group[i]= obj.next().charAt(0);
		}
		
		System.out.println("=================");
		
		//for printing the reference
		System.out.println("Reference is: "+ group);
		
		System.out.println("=================");
		
		// For no of elements in the array
		System.out.println("\nNo of element in array is: "+group.length);
		
		System.out.println("=================");
		
		//printing by help of index value
		System.out.println("1st group is: " + group[0]);
		System.out.println("2nd group is: " + group[1]);
		System.out.println("3rd group is: " + group[2]);
		System.out.println("4th group is: " + group[3]);
		System.out.println("5th group is: " + group[4]);
		System.out.println("6th group is: " + group[5]);
		System.out.println("7th group is: " + group[6]);
		System.out.println("8th group is: " + group[7]);
	
		
		System.out.println("=================");
		
		System.out.println("\nIn forward direction using for loop........");
	//for accessing the value in forward direction using for loop
	for(int i=0; i<group.length; i++) {
		System.out.println("Entered value at  " + i + " index is: " + group[i]);
		
		}
	
	System.out.println("\nIn Backward direction using for loop.........");
	//for accessing the value in backward direction using for loop
	for(int i=group.length-1; i>=0; i--) {
		System.out.println("Entered value at  " + i + " index is: " + group[i]);
		
		}
	
	System.out.println("=================");
	
	System.out.println("\nIn forward direction using while loop........");
	//for accessing the value in forward direction using while loop
	int k=0;
	while(k<group.length){
		System.out.println("Entered value at  " + k + " index is: " + group[k]);
		k++;
	}
	
	System.out.println("\nIn backward direction using while loop........");
	//for accessing the value in Backward direction using while loop
		k=group.length-1;
	while( k>=0){
		System.out.println("Entered value at  " + k + " index is: " + group[k]);
		k--;
	}
	
	System.out.println("=================");
	
	System.out.println("\nIn forward direction using do-while loop........");
	//for accessing the value in forward direction using do-while loop
	 k=0;
	 do {
		 System.out.println("Entered value at  " + k + " index is: " + group[k]);
		 k++;
	} while (k<group.length);
	 
	 
	 System.out.println("\nIn backward direction using do-while loop........");
		//for accessing the value in backward direction using do-while loop
		 k=group.length - 1;
		 do {
			 System.out.println("Entered value at  " + k + " index is: " + group[k]);
			 k--;
		} while (k>=0);
		
		obj.close();
	}

}
