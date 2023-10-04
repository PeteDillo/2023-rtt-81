package pratice;

public class Pratice {
//write a for loop that calculates the sum of all the numbers between 1 and 100
	static void task1() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("The sum of all the numbers between 1 and 100 is: " + sum);
	}

// write a for loop that calculates the sum of the remainders of each number divided by 2 between 1 and 100
	static void task2() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i % 2;
		}

		System.out.println("The sum of the remainders of each number divided by 2 between 1 and 100 is: " + sum);
	}

//write a for loop that calculates the sum of the divisor of each number divided by 2 between 1 and 100
	static void task3() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
		}

		System.out.println("The sum of the divisor of each number divided by 2 between 1 and 100 is: " + sum);
	}

//write a while loop ...  while a number is greater than 0 subtract 1 from the number starting at 10.
	static void task4() {
		int number = 10;
		while (number > 0) {
			number -= 1;
			System.out.println(number);
		}
	}

	public static void main(String[] args) {
		task1();
		task2();
		task3();
		task4(); 

	}
}
