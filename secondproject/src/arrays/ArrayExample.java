package arrays;

public class ArrayExample {

	public static void main(String[] args) {
		int arraySize= 20;
		
		double[] doubleArray = new double[arraySize];
		
		String[] stringArray = new String[arraySize];
		stringArray[1] = "one";
		stringArray[2] = "two";
		stringArray[0] = "zero";
		stringArray[19] = "nine";
		
//		for(int pos =0; pos < stringArray.length; pos++) {
//			System.out.println("" + pos + "" + stringArray[pos]);
//		}
//		
//		for(String pos : stringArray) {
//			System.out.println("The vaule of pos = " + pos);
//		}
		
		int numOfNull = 0;
		for(int i = 0; i < stringArray.length; i++) {
			if(stringArray[i] == null) {
				numOfNull++;
			}
		}
		System.out.println(numOfNull);
		
		int firstnull = 0;
		for(int i = 0; i < stringArray.length; i++) {
			if(stringArray[i] == null) {
				firstnull = i;
				break;
			}
		}
		System.out.println("first null index" + firstnull);
	}

}
