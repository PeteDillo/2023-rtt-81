package pa303_7_1;

public class TaskFour {
	 public static void main(String[] args) {
	        int[] myArray = {1, 2, 3, 4, 5};

	        // Print out the value at the first index
	        System.out.println(myArray[0]);

	        // Print out the value at the last index using length - 1 as the index
	        System.out.println(myArray[myArray.length - 1]);

	        // Try printing the value at index = length
	        try {
	            System.out.println(myArray[myArray.length]);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
	        }

	        // Try assigning a value to the array index 5
	        try {
	            myArray[5] = 10;
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
	        }
	    }
}
