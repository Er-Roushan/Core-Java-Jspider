package workWithArray;

import java.util.Scanner;

public class EvenIndexElement {

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
		
		System.out.println("\nBelow are the elements present at the even index in the array......");
		
		for(int i=0; i<arr.length; i++) {
			if(i == 0) {
				continue;
			}
			if(i % 2 == 0) {
				System.out.print(arr[i]+" ");
			}
		}
		
		obj.close();
	}

}
