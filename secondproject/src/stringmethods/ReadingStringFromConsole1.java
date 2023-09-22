package stringmethods;

import java.util.Scanner;

public class ReadingStringFromConsole1 {

	public static void main(String[] args) {
			//this is the scanner 
	       Scanner input = new Scanner(System.in);
	       //message in console
	       System.out.print("Enter three words separated by spaces: ");
	       //Capture each word 
	       //.next() only does one word
	       String s1 = input.next();
	       String s2 = input.next();
	       String s3 = input.next();
	       //display variables capture 
	       System.out.println("s1 is " + s1);
	       System.out.println("s2 is " + s2);
	       System.out.println("s3 is " + s3);
	       //close scanner best practice
	       input.close();
	       
	}
}
