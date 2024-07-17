package workWithArray;
import java.util.Scanner;

public class NameArray {

	public static void main(String[] args) {
		
Scanner obj = new Scanner(System.in);
		
		String[] name = new String[10];
		
		// To store the value inside the array
		
		for(int i=0; i<name.length; i++) {
			System.out.print("Enter the "+ (i+1) + " Name: ");
			name[i]= obj.nextLine();
		}
		
		System.out.println("=================");
		
		//for printing the reference
		System.out.println("Reference is: "+ name);
		
		System.out.println("=================");
		
		// For no of elements in the array
		System.out.println("\nNo of element in array is: "+name.length);
		
		System.out.println("=================");
		
		//printing by help of index value
		System.out.println("1st Name is: " + name[0]);
		System.out.println("2nd Name is: " + name[1]);
		System.out.println("3rd Name is: " + name[2]);
		System.out.println("4th Name is: " + name[3]);
		System.out.println("5th Name is: " + name[4]);
		System.out.println("6th Name is: " + name[5]);
		System.out.println("7th Name is: " + name[6]);
		System.out.println("8th Name is: " + name[7]);
		System.out.println("9th Name is: " + name[8]);
		System.out.println("10th Name is: " + name[9]);
		
		
		System.out.println("=================");
		
		System.out.println("\nIn forward direction using for loop........");
	//for accessing the value in forward direction using for loop
	for(int i=0; i<name.length; i++) {
		System.out.println("Entered value at  " + i + " index is: " + name[i]);
		
		}
	
	System.out.println("\nIn Backward direction using for loop.........");
	//for accessing the value in backward direction using for loop
	for(int i=name.length-1; i>=0; i--) {
		System.out.println("Entered value at  " + i + " index is: " + name[i]);
		
		}
	
	System.out.println("=================");
	
	System.out.println("\nIn forward direction using while loop........");
	//for accessing the value in forward direction using while loop
	int k=0;
	while(k<name.length){
		System.out.println("Entered value at  " + k + " index is: " + name[k]);
		k++;
	}
	
	System.out.println("\nIn backward direction using while loop........");
	//for accessing the value in Backward direction using while loop
		k=name.length-1;
	while( k>=0){
		System.out.println("Entered value at  " + k + " index is: " + name[k]);
		k--;
	}
	
	System.out.println("=================");
	
	System.out.println("\nIn forward direction using do-while loop........");
	//for accessing the value in forward direction using do-while loop
	 k=0;
	 do {
		 System.out.println("Entered value at  " + k + " index is: " + name[k]);
		 k++;
	} while (k<name.length);
	 
	 
	 System.out.println("\nIn backward direction using do-while loop........");
		//for accessing the value in backward direction using do-while loop
		 k=name.length - 1;
		 do {
			 System.out.println("Entered value at  " + k + " index is: " + name[k]);
			 k--;
		} while (k>=0);
		
		obj.close();
	}
		
	}


