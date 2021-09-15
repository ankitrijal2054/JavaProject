package assignment1;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String word = scan.nextLine();
		System.out.println();
		String reverse = "";
		
		int i = word.length()-1;
		for(; i>=0; i--) {
			reverse += word.charAt(i);
		}
		
		System.out.println("Reverse of " + word + " is " + reverse);
	}

}
