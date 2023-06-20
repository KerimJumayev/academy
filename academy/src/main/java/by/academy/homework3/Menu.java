package by.academy.homework3;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		printMenu();
		Scanner scan = new Scanner(System.in);
		int sc = scan.nextInt();
		Product[] array = new Product[10];

		while (sc != 0) {

			switch (sc) {
			case 0:
				return;
			case 1:
				addProduct(scan, array);
				System.out.println(" add product");
				break;

			}
			printMenu();
			sc = scan.nextInt();

		}

		System.out.println("fin program");
		scan.close();
	}

	public static void addProduct(Scanner scan, Product array[]) {
		System.out.println("enter pro type");
		String type = scan.next();
		switch (type) {
		case "wine":
			String name = scan.next();
			int price = scan.nextInt();
			int quantity = scan.nextInt();
			String color = scan.next();
			int alcoholPercent = scan.nextInt();

			Product p = new Wine(name, price, quantity, color, alcoholPercent);
			array[0] = p;
			break;
		}
	}

	public static void printMenu() {
		System.out.println("0 - ex pro");
		System.out.println("1- add product");

	}

}
