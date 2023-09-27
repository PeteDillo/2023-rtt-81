package pa303_7_1;

public class Task5 {
	public static void main(String[] args) {
		int[] myArray = new int[5]; // Create an integer array with a length of 5

		// Loop through the array and assign the value of the loop control variable
		// (e.g., i) to the corresponding index in the array
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = i;
		}

		// Print out the array elements
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	}
}
