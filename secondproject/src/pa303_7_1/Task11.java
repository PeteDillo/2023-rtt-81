package pa303_7_1;

import java.util.Arrays;
import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		// Ask the user how many favorite things they have
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many favorite things do you have?");
        int numberOfFavoriteThings = scanner.nextInt();

        // Create a String array of the correct size
        String[] favoriteThings = new String[numberOfFavoriteThings];

        // Ask the user to enter the things and store them in the array
        for (int i = 0; i < numberOfFavoriteThings; i++) {
            System.out.println("Enter your favorite thing " + (i + 1) + ": ");
            favoriteThings[i] = scanner.nextLine();
            scanner.nextLine();
        }

        // Print out the contents of the array
        System.out.println("Your favorite things are:");
        System.out.println(Arrays.toString(favoriteThings));

        scanner.close();

	}

}
