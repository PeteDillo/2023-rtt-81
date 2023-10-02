package coffeeshop;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeShop {

	// Array of products
	List<Product> products = new ArrayList<>();

	// this is the list of products in your order
	List<Product> order = new ArrayList<>();

	// scanner class to detect user input
	Scanner input = new Scanner(System.in);

	// fill array with products
	public void setupProducts() {
		Product coffee = new Product();
		coffee.setName("Coffee");
		coffee.setPrice(5.44);
		products.add(coffee);

		Product tea = new Product();
		tea.setName("Tea");
		tea.setPrice(4.33);
		products.add(tea);

		Product cookie = new Product();
		cookie.setName("Cookie");
		cookie.setPrice(5.44);
		products.add(cookie);

		Product muffin = new Product();
		muffin.setName("Muffin");
		muffin.setPrice(3.44);
		products.add(muffin);

	}

	// object passed in will run the getters on the product object
	public void printProduct(Product product) {
		System.out.println(product.getName() + "\t $" + product.getPrice());
	}

	// print entire array of products
	public void printAllProducts() {
		for (Product product : products) {
			printProduct(product);
		}
	}

	// print entire array of products
	public void printOrder() {
		for (Product order : order) {
			printProduct(order);
		}
	}

	// example code that showed the basics
	public void example() {
		double coffee = 5.44d;
		double tea = 4.33d;
		double cookie = 6.73d;

		double subTotal = 0;
		subTotal = (coffee * 1) + (tea * 1) + (cookie * 1);

		// Useful for formatting
		DecimalFormat df = new DecimalFormat("#,###.00");

		System.out.println("subTotal : " + df.format(subTotal));

		double salesTax = subTotal * 0.10;
		System.out.println("Sales Tax : " + df.format(salesTax));

		double totalSale = subTotal * salesTax;
		System.out.println("Total : " + df.format(totalSale));
	}

	// create a menu in the terminal
	public int displayMainUserMenu() {
		// menu display
		System.out.println("1) Print the menu and prices");
		System.out.println("2) Add an item to your order");
		System.out.println("3) Print the items in your order");
		System.out.println("4) Checkout");
		System.out.println("5) Exit");
		// user input
		System.out.println("\nWhat do you want to do?");
		int select = input.nextInt();
		input.nextLine();

		// return user input
		return select;

	}

	public void userSelectProduct() {
		System.out.println("Enter Product name to order: ");
		String orderSelection = input.nextLine();
		// loop through products array and look for user selection
		for (Product product : products) {
			if (product.getName().equalsIgnoreCase(orderSelection)) {
				// add product to order
				order.add(product);
				// print confirmation
				System.out.println("Added " + product.getName() + " to your order.");
			}
		}
	}

	public static void main(String args[]) {
		CoffeeShop cf = new CoffeeShop();
		cf.setupProducts();

		while (true) {
			// grab user selection from scanner
			int userSelection = cf.displayMainUserMenu();
			// conditionals for menu
			if (userSelection == 1) {
				cf.printAllProducts();
			} else if (userSelection == 2) {
				cf.userSelectProduct();
			} else if (userSelection == 3) {
				cf.printOrder();
			} else if (userSelection == 5) {
				System.exit(0);
			} else {
				System.out.println("User input " + userSelection + " is unknown. try again.");
			}

		}
	}

}
