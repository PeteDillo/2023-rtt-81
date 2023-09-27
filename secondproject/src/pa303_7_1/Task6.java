package pa303_7_1;

public class Task6 {
	public static void main(String[] args) {
		int[] myArray = { 1, 2, 3, 4, 5 }; // Create an integer array of 5 numbers

		// Loop through the array and assign the value of the loop control variable
		// multiplied by 2 to the corresponding index in the array
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = i * 2;
		}

		// Print out the array elements
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	}
}
