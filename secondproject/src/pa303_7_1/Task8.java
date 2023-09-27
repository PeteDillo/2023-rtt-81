package pa303_7_1;

public class Task8 {
	public static void main(String[] args) {
		String[] myArray = { "a", "b", "c", "d", "e" }; // Create a String array of 5 elements

		// Swap the first element with the middle element without creating a new array
		String temp = myArray[0];
		myArray[0] = myArray[2];
		myArray[2] = temp;

		// Print out the array elements
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	}
}
