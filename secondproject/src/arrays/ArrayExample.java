package arrays;

public class ArrayExample {

	public static void main(String[] args) {
		int arraySize = 20;

		double[] doubleArray = new double[arraySize];

		String[] stringArray = new String[arraySize];
		stringArray[1] = "one";
		stringArray[2] = "two";
		stringArray[0] = "zero";
		stringArray[9] = "nine";

		for (int pos = 0; pos < stringArray.length; pos++) {
			System.out.println("" + pos + "" + stringArray[pos]);
		}

		for (String pos : stringArray) {
			System.out.println("The vaule of pos = " + pos);
		}
		int numOfNull = 0;
		for (int i = 0; i < stringArray.length; i++) {
			if (stringArray[i] == null) {
				numOfNull++;
			}
		}
		System.out.println(numOfNull);

		int firstnull = 10;
		for (int i = 0; i < stringArray.length; i++) {
			if (stringArray[i] == null) {
				firstnull = i;
				break;
			}
		}
		System.out.println("first null index " + firstnull);

		int lastnull = -1;

		for (int i = stringArray.length -1; i >= 0; i--) {
			if (stringArray[i] == null) {
				lastnull = i;
				break;
			}
		}

		System.out.println("last null index " + lastnull);

		String letters = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";

		String vowels = "aeiou";
		String[] allLetters = letters.split(",");
		
		int nmbersOfLetters = 0;
		for(String letter : allLetters) {
			if(!vowels.contains(letter)) {
				nmbersOfLetters++;
			}
		}
		System.out.println("Numbers of letter: " + nmbersOfLetters)
		;
	}

}
