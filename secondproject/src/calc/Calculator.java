package calc;

import java.util.Scanner;

public class Calculator {

	// menu function
    public void menu() {
    	
        System.out.println("Welcome to the calculator!");
        System.out.println("Please enter two numbers:");
      //Capture inputs
        double num1 = inputDouble();
        double num2 = inputDouble();
        //print statements
        System.out.println("Please select an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        int operation = inputInt();

        double result = 0;
        
        //swtich case to determine operatiopn
        switch (operation) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = subtract(num1, num2);
                break;
            case 3:
                result = multiply(num1, num2);
                break;
            case 4:
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }

        System.out.println("The result is: " + result);
    }
    //calc methods
    private double add(double num1, double num2) {
        return num1 + num2;
    }

    private double subtract(double num1, double num2) {
        return num1 - num2;
    }

    private double multiply(double num1, double num2) {
        return num1 * num2;
    }

    private double divide(double num1, double num2) {
        return num1 / num2;
    }

    private double inputDouble() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private int inputInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
	
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.menu();
	}
	
}
