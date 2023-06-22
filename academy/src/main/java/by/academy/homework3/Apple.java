package by.academy.homework3;

public class Apple extends Products {

	String color;

	public Apple(String name, int price, int quantity, String color) {
		super(name, price, quantity);
		this.color = color;

	}

	@Override
	public int disCount() {
		if (quantity > 6) {
			return 3;
		}
		return 1;
	}

}
