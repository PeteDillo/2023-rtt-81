package variables;

public class ConditionalOperator {
	public static void main(String[] args) {
		
		boolean conditionOne = false;
		boolean conditionTwo = true;

		// this is the and operator same as JavaScript
		if (conditionOne && conditionTwo) {
			// won't run because both conditions are not true
			System.out.println("if this ran both conditions are true");
		} else {
			System.out.println("Else statement");
		}
		// logs because condition one becomes true with !
		if (!conditionOne && conditionTwo) {
			System.out.println("Both are true");
		}
		// this is the or operator same as JavaScript
		if (conditionOne || conditionTwo) {
			System.out.println("One is true");
		}
		
		int x = 10;

		if ((x > 3) && (x < 20)) {
			System.out.println("x is between 3 and 20");
		}

		int y = 4;
		//if the remainder equals ( == ) 1 the number is odd
		if ((y % 2) == 1) {
			System.out.println("This is an odd number");
		} else {
			System.out.println("This is an even number");
		}
	}
}
