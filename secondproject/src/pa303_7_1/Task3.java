package pa303_7_1;

import java.util.Arrays;

public class Task3 {

	public static void main(String[] args) {
		String[] myArray = { "red", "green", "blue", "yellow" };

		System.out.println(myArray.length);

		String[] copiedArray = myArray.clone();

		String copiedArrayString = Arrays.toString(copiedArray);
		System.out.println(copiedArrayString);
	}

}
