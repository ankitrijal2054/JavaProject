package assignment1;

import java.util.Scanner;

public class TwoSum {

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
		System.out.print("Enter target integer: ");
		int target = scan.nextInt();
		
		System.out.println("The indices of the two numbers whose sum is equal to " + target + " are:");
		for(int j=0; j<num-1; j++) {
			for(int k=j+1; k<num; k++) {
				if(array[j] + array[k] == target) {
					System.out.println("[" + j + ", " + k + "]");
				}
			}
		}
		scan.close();	
	}

}
