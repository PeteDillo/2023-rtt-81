package controlflow;

public class ProblemThree {
	public static void main(String[] args) {
		int x = 15;

		if (x < 10) {
			System.out.println("Less than 10");
		} else if (x < 20) {
			System.out.println("Between 10 and 20");
		} else {
			System.out.println("Greater than or equal to 20");
		}
	}
}
