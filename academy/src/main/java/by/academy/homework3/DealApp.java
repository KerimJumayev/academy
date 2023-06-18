package by.academy.homework3;

public class DealApp {

	public static void main(String[] args) {

		User sellerB = new User("John", 30, 400);
		User buyerF = new User("Bob", 25, 500);

		Products[] products = new Products[10];
		products[0] = new Products("apple", 10, 2);
		products[0] = new Products("banana", 15, 6);
		products[0] = new Products("orange", 20, 4);

		Deal deal = new Deal("Houston", sellerB, buyerF, products);
		System.out.println("Full deal cost" + deal.calcPrice());

	}

}
