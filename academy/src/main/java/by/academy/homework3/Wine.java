package by.academy.homework3;

import java.util.Objects;

public class Wine extends Products {

	String color;
	int alcoholPercent;

	public Wine(String name, int price, int quantity, String color, int alcoholPercent) {
		super(name, price, quantity);
		this.color = color;
		this.alcoholPercent = alcoholPercent;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the alcoholPercent
	 */
	public int getAlcoholPercent() {
		return alcoholPercent;
	}

	/**
	 * @param alcoholPercent the alcoholPercent to set
	 */
	public void setAlcoholPercent(int alcoholPercent) {
		this.alcoholPercent = alcoholPercent;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(alcoholPercent, color);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wine other = (Wine) obj;
		return alcoholPercent == other.alcoholPercent && Objects.equals(color, other.color);
	}

	@Override
	public int disCount() {
		if (quantity > 8) {
			return 7;
		}
		return 1;
	}

}
