package by.academy.homework3;

public class DealApp {

	public static void main(String[] args) {

		User sellerB = new User("John", 30, 400);
		User buyerF = new User("Bob", 25, 500);

		Products[] products = new Products[10];
		products[0] = new Apple("aplle", 20, 5, "red");
		products[0] = new Banana("banana", 10, 5, 2);
		products[0] = new Wine("Choto", 200, 1, "red", 12)
		
//		String name, int price, int quantity, String producer, boolean isBlack, String sort
			
		;
		Deal deal = new Deal();
		System.out.println("Full deal cost" + deal.calcPrice());

	}

}
