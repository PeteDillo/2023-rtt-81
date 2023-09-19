package variables;

public class ConditionalOperator {
	public static void main (String[] args) {
		boolean condtionOne = false;
		boolean condtionTwo = true;
		
		//this is the and operator same as JavaScript
		if(condtionOne && condtionTwo){
			//won't run because both conditions are not true
			System.out.println("false");
		}
		else {
			System.out.println("Else statement");
		}
		//logs because condition one becomes true with ! 
		if(!condtionOne && condtionTwo){
			System.out.println("Both are true");
		}
		//this is the or operator same as JavaScript
		if(condtionOne || condtionTwo){
			System.out.println("One is true");
		}
		int x =10;
		
		if((x > 3) && (x < 20)){
			System.out.println("x is between 3 and 20");
		}
		
		int y = 4;
		if((y % 2) ==1){
			System.out.println("This is an odd number");
		}else {
			System.out.println("This is an even number");
		}
		}
}
