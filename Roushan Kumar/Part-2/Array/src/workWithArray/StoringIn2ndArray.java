package workWithArray;

import java.util.Scanner;

public class StoringIn2ndArray {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int[] arr1;
		System.out.print("Enter the Size of Array: ");
		int size = obj.nextInt();
		
		arr1 = new int[size];
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print("Enter the "+ (i+1)+ " element: ");
			arr1[i]= obj.nextInt();
		}
		
		//second array creation
		int[] arr2 = new int[size];
		
		for(int i=0, k=arr1.length-1; i<arr2.length; i++) {
			arr2[i]= arr1[k];
			k--;
		}
		System.out.println("\nBelow are the elements you have entered in the array1 and stored in reverse order in array second......");
		
		for(int i=0; i<arr2.length; i++) {
			
				System.out.print(arr2[i]+" ");
			
		}
		
		obj.close();
	}

}
