package by.academy.homework3;

import java.text.DateFormat;
import java.util.Scanner;

public class Menu {

	private Deal deal;
	private Validator phoneValidator = new BelarusPhoneValidator();
	private Validator emailValidator = new AmericanPhoneValidator();

	public Menu(Deal deal) {
		super();
		this.deal = deal;
	}

	public static void main(String[] args) {

	public void start() {
		int choise;
		printMenu();
		Scanner scan = new Scanner(System.in);
		int sc = scan.nextInt();
		Product[] array = new Product[10];

		Deal d = new Deal();

		while (sc != 0) {

			choise = scan.nextInt();
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

	public  Product createProduct(Scanner scan) {
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

			deal.addProduct(new Wine(name, price, quantity, color, alcoholPercent));

		}
		return null;
	}
	private User createUser() {

		User user = new User();

		System.out.println("Enter user name: ");
		Scanner scan;
		user.setName(scan.next());

		System.out.println("Enter user age: ");
		user.setAge(scan.nextInt());

		System.out.println("Enter user money");
		user.setManney(scan.nextInt());

		String dateOfBirth;
		do {
			System.out.println("Enter user dateOfBirth (dd/mm/yyyy or dd-mm-yyyy): ");
			dateOfBirth = scan.next();

		} while (!DateFormat.isValidDate(dateOfBirth));

		user.segeDateOfBirth(DateFormat.parse(dateOfBirth));

		String phone;
		do {
			System.out.println("Enter user phone : ");
			phone = scan.next();

		} while (!phoneValidator.isValid(phone));
		user.setPhone(phone);

		String email;
		do {
			System.out.println("Enter user email : ");
			email = .next();

		} while (!emailValidator.isValid(email));
		user.setEmail(email);

		return user;

	}

	public static void printMenu() {
		System.out.println("Make some choise:");
		System.out.println("0 - Exit program");
		System.out.println("1 - Add product");
		System.out.println("2 - Set buyer");
		System.out.println("3 - Set seller");
		System.out.println("4 - Remove product");
		System.out.println("5 - Print products");
		System.out.println("6 - Deal");

	}

	public User creatUser() {

	}

	public User creatSeller() {
		System.out.println("enter seller info:");
		deal.setSeller(creatSeller());
	}

	public void creatBuyer() {
		System.out.println("enter buyer info:");
		deal.setBuyer(creatUser());
	}

	public void printProducts() {
		deal.addProduct(null);

	}

}
