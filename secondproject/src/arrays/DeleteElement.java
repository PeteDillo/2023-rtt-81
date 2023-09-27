package arrays;

import java.util.Arrays;

public class DeleteElement {

	public static void main(String[] args) {
		//i have a error here  somewhere
		int[] numbers = { 0, 1, 2, 3, 4, 5 };

		int positionToDelete = 1;
		for (int pos = positionToDelete; pos < numbers.length - 1; pos++) {
			numbers[pos] = numbers[pos + 1];
		}

		int[] target = new int[numbers.length - 1];
		for (int pos = 0; pos < target.length; pos++) {
			target[pos] = numbers[pos];
		}
		System.out.println("after copy = " + Arrays.toString(target));
	}

}
