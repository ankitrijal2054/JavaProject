package assignment1;
import java.util.Scanner;

public class age {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a age: ");
		int age = scan.nextInt();
		System.out.println();		
		if(age < 13) {
			System.out.println("Kid");
		}
		else if(age >= 13 && age <= 19) {
			System.out.println("Teen");
		}
		else {
			System.out.println("Adult");
		}
		
		
		scan.close();
			
	}
}