package assignment1;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of integer you want to enter: ");
		int num = scan.nextInt();
		int[] array = new int[num];
		System.out.println();
		System.out.println("Enter the list of integer: ");
		for(int i=0; i<num; i++) {
			array[i] = scan.nextInt();
		}
		int min = array[0];
		int max = array[0];
		for(int j=1; j<num; j++) {
			//for max
			if(array[j] > max) {
				max = array[j];
			}
			//for min	
			if(array[j] < min) {
				min = array[j];
			}
		}
		System.out.println("The minimum on the list is: " + min);
		System.out.println("The maximum on the list is: " + max);
		
		scan.close();
	}

}
