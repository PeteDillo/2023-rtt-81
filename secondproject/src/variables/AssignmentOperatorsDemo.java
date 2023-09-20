package variables;

public class AssignmentOperatorsDemo {
	public static void main(String args[]) {
		// create variables
		int j, k;

		j = 10;
		j = 5;
		k = j;
		
		//log variables out
		System.out.println("j is : " + j);
		System.out.println("k is : " + k);
		
		//reassign two variables
		k = j = 10;
		System.out.println("j is : " + j);
		System.out.println("k is : " + k);
	}
}
