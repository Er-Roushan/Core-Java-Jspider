package workWithArray;
import java.util.Scanner;

public class ShortArray {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		short arr[] = new short[4];
	
		//For entering the value
		for(int i=0; i<arr.length; i++) {
			System.out.print("Enter the " + (i+1) + " Value: ");
			arr[i]= obj.nextShort();
			}
		
		//Printing the reference ([S@)
		
		System.out.println("Reference variable of arr: "+ arr);

		
		// For no of elements in the array
			System.out.println("\nNo of element in array is: "+arr.length);
		
		
			System.out.println("\nIn forward direction using for loop........");
		//for accessing the value in forward direction using for loop
		for(int i=0; i<arr.length; i++) {
			System.out.println("Entered value at  " + i + " index is: " + arr[i]);
			
			}
		
		System.out.println("\nIn Backward direction using for loop.........");
		//for accessing the value in backward direction using for loop
		for(int i=arr.length-1; i>=0; i--) {
			System.out.println("Entered value at  " + i + " index is: " + arr[i]);
			
			}
		

		System.out.println("\nIn forward direction using while loop........");
		//for accessing the value in forward direction using while loop
		int k=0;
		while(k<arr.length){
			System.out.println("Entered value at  " + k + " index is: " + arr[k]);
			k++;
		}
		
		System.out.println("\nIn backward direction using while loop........");
		//for accessing the value in Backward direction using while loop
			k=arr.length-1;
		while( k>=0){
			System.out.println("Entered value at  " + k + " index is: " + arr[k]);
			k--;
		}
		
		
		System.out.println("\nIn forward direction using do-while loop........");
		//for accessing the value in forward direction using do-while loop
		 k=0;
		 do {
			 System.out.println("Entered value at  " + k + " index is: " + arr[k]);
			 k++;
		} while (k<arr.length);
		 
		 
		 System.out.println("\nIn backward direction using do-while loop........");
			//for accessing the value in backward direction using do-while loop
			 k=arr.length - 1;
			 do {
				 System.out.println("Entered value at  " + k + " index is: " + arr[k]);
				 k--;
			} while (k>=0);
			 
		 
		
		obj.close();

	}

}
