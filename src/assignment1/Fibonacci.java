package assignment1;

public class Fibonacci {

	public static void main(String args[]) {
		Singleton fib = Singleton.getInstance();
		
		System.out.println(fib.first);
		System.out.println(fib.next);
		int sum;
		
		for(int i=1; i<9; i++) {
			sum = fib.first + fib.next;
			System.out.println(sum);
			fib.first = fib.next;
			fib.next = sum;
			
		}
		
		
	}
}
