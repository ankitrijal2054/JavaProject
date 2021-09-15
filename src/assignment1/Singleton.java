package assignment1;

public class Singleton {
	static Singleton st = new Singleton();
	public int first;
	public int next;
	private Singleton(){
		first = 0;
		next = 1;
	}
	
	static Singleton getInstance() {
		return st;
	}
}
