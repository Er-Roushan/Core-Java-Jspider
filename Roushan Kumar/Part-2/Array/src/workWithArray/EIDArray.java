package workWithArray;

import java.util.Scanner;

public class EIDArray {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		int[] e_id = new int[3];
		
		// To store the value inside the array
		
		for(int i=0; i<e_id.length; i++) {
			System.out.print("Enter the "+ (i+1) + " e_id No: ");
			e_id[i]= obj.nextInt();
		}
		
		System.out.println("=================");
		
		//for printing the reference
		System.out.println("Reference is: "+ e_id);
		
		System.out.println("=================");
		
		// For no of elements in the array
		System.out.println("No of element in array is: "+e_id.length);
		
		System.out.println("=================");
		
		//printing by help of index value
		System.out.println("Ist e_id No is: " + e_id[0]);
		System.out.println("2nd e_id No is: " + e_id[1]);
		System.out.println("3rd e_id No is: " + e_id[2]);

		
		
		System.out.println("=================");
		
		System.out.println("\nIn forward direction using for loop........");
	//for accessing the value in forward direction using for loop
	for(int i=0; i<e_id.length; i++) {
		System.out.println("Entered value at  " + i + " index is: " + e_id[i]);
		
		}
	
	System.out.println("\nIn Backward direction using for loop.........");
	//for accessing the value in backward direction using for loop
	for(int i=e_id.length-1; i>=0; i--) {
		System.out.println("Entered value at  " + i + " index is: " + e_id[i]);
		
		}
	
	System.out.println("=================");
	
	System.out.println("\nIn forward direction using while loop........");
	//for accessing the value in forward direction using while loop
	int k=0;
	while(k<e_id.length){
		System.out.println("Entered value at  " + k + " index is: " + e_id[k]);
		k++;
	}
	
	System.out.println("\nIn backward direction using while loop........");
	//for accessing the value in Backward direction using while loop
		k=e_id.length-1;
	while( k>=0){
		System.out.println("Entered value at  " + k + " index is: " + e_id[k]);
		k--;
	}
	
	System.out.println("=================");
	
	System.out.println("\nIn forward direction using do-while loop........");
	//for accessing the value in forward direction using do-while loop
	 k=0;
	 do {
		 System.out.println("Entered value at  " + k + " index is: " + e_id[k]);
		 k++;
	} while (k<e_id.length);
	 
	 
	 System.out.println("\nIn backward direction using do-while loop........");
		//for accessing the value in backward direction using do-while loop
		 k=e_id.length - 1;
		 do {
			 System.out.println("Entered value at  " + k + " index is: " + e_id[k]);
			 k--;
		} while (k>=0);
		
		obj.close();
	}

}
