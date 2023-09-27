package pa303_7_1;

public class Task7 {
	public static void main(String[] args) {
		int[] myArray = { 1, 2, 3, 4, 5 }; // Create an array of 5 elements

		// Loop through the array and print the value of each element, except for the
		// middle (index 2) element
		for (int i = 0; i < myArray.length; i++) {
			if (i != 2) {
				System.out.println(myArray[i]);
			}
		}
	}
}
