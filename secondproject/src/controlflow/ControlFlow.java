package controlflow;

public class ControlFlow {
	public static void main(String[] args) {
		int x = 7;

		// problem 1
		if (x < 10) {
			System.out.println("Less than 10");
		}
		// problem 2
		else if (x > 10) {
			System.out.println("Greater than 10");
		}
		// problem 3
		else if ((x > 10) || (20 < x)) {
			System.out.println("Between 10 and 20");
			
		}
		else if ((x < 10) || (20 > x)) {
			System.out.println("Out of range");
		}
		else {
			System.out.println("In range");
		}
	}
}
