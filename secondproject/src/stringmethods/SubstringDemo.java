package stringmethods;

public class SubstringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String example = "This is an example";

        // Find the position of the first space in the string
        int firstSpaceIndex = example.indexOf(" ");

        // Find the position of the last space in the string
        int lastSpaceIndex = example.lastIndexOf(" ");

        // Get the substring of the characters between the first and last space of the string
        String substringBetweenSpaces = example.substring(firstSpaceIndex + 1, lastSpaceIndex);

        System.out.println("Substring between first and last space: " + substringBetweenSpaces);

        // Find the first and last vowel in the string
        int firstVowelIndex = example.indexOf("aeiouAEIOU");
        int lastVowelIndex = example.lastIndexOf("aeiouAEIOU");

        // Get the substring of the characters between the first and last vowel of the string
        String substringBetweenVowels = example.substring(firstVowelIndex, lastVowelIndex + 1);

        System.out.println("Substring between first and last vowel: " + substringBetweenVowels);
        
        int stringLength = example.length();

        // Loop over the entire string and print out each character with a new line after it
        for (int i = 0; i < stringLength; i++) {
            char character = example.charAt(i);
            System.out.println(character);
        }
        
        
        
        
	}
	
	


}
