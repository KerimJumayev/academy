package by.academy.homework3;

import java.util.Scanner;

public class Menu {

	private Deal deal;

	public Menu(Deal deal) {
		super();
		this.deal = deal;
	}

	public static void main(String[] args) {

		printMenu();
		Scanner scan = new Scanner(System.in);
		int sc = scan.nextInt();
		Product[] array = new Product[10];

		Deal d = new Deal();

		while (sc != 0) {

			switch (sc) {
			case 0:
				return;
			case 1:
				Product p = createProduct(scan);
				if (p == null) {
					break;
				}
				d.addProduct(p);
				System.out.println(" add product");
				break;

			}
			printMenu();
			sc = scan.nextInt();

		}

		System.out.println("fin program");
		scan.close();
	}

	public static Product createProduct(Scanner scan) {
		System.out.println("enter product type");
		String type = scan.next();
		switch (type) {
		case "wine":
			System.out.println("type name Wine ");
			String name = scan.next();

			System.out.println("Wine price");
			int price = scan.nextInt();

			System.out.println("Wine quantity");
			int quantity = scan.nextInt();

			System.out.println("Wine color");
			String color = scan.next();

			System.out.println("Wine alcohol percent");
			int alcoholPercent = scan.nextInt();

			Deal.addProduct(new Wine(name, price, quantity, color, alcoholPercent));

		}
		return null;
	}

	public static void printMenu() {
		System.out.println("0 - ex pro");
		System.out.println("1- add product");

	}
	

}
