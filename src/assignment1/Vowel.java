package assignment1;
import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String word = scan.nextLine().toLowerCase();
		System.out.println();
		
		int count = 0;
		for(int i=0; i<word.length(); i++) {
			char ch =(word.charAt(i));
			if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
				count++;
			}
		}
		System.out.println("The number of vowel in "+ word + " is: " + count);
		
		scan.close();
	}

}
