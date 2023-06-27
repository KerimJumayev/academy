package by.academy.homework3;

import java.util.Scanner;

public class DealApp {

	public static void main(String[] args) {

		
		
		Scanner scan = new Scanner(System.in);
		User sellerB = new User("John", 30, 400);
		User buyerF = new User("Bob", 25, 500);

		Products[] products = new Products[10];
		products[0] = new Apple("aplle", 20, 5, "red");
		products[0] = new Banana("banana", 10, 5, 2);
		products[0] = new Wine("Choto", 200, 1, "red", 12);
		
		Deal deal = new Deal("Borabora", buyerF, sellerB, null);
		Menu menu = new Menu(deal);
		
		
		System.out.println("Full deal cost" + deal.calcPrice());

	}

}
