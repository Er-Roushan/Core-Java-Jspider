package workWithArray;

import java.util.Scanner;

public class NoOfOddEleArray {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		int[] arr;
		System.out.print("Enter the Size of Array: ");
		int size = obj.nextInt();
		
		arr = new int[size];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("Enter the "+ (i+1)+ " element: ");
			arr[i]= obj.nextInt();
		}
		
		
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 != 0) {
				count++;
			}
		}
		
		System.out.println("\nNo of odd elements in the array is: "+count);
		
		obj.close();
	}

}
