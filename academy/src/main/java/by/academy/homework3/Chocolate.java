package by.academy.homework3;

import java.util.Objects;

public class Chocolate extends Product {

	String producer;
	boolean isBlack;

	public Chocolate(String name, int price, int quantity, String producer, boolean isBlack) {
		super(name, price, quantity);
		this.producer = producer;
		this.isBlack = isBlack;
	}

	/**
	 * @return the producer
	 */
	public String getProducer() {
		return producer;
	}

	/**
	 * @param producer the producer to set
	 */
	public void setProducer(String producer) {
		this.producer = producer;
	}

	/**
	 * @return the isBlack
	 */
	public boolean isBlack() {
		return isBlack;
	}

	/**
	 * @param isBlack the isBlack to set
	 */
	public void setBlack(boolean isBlack) {
		this.isBlack = isBlack;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(isBlack, producer);
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
		Chocolate other = (Chocolate) obj;
		return isBlack == other.isBlack && Objects.equals(producer, other.producer);
	}

	@Override
	public String toString() {
		return "Chocolate [producer=" + producer + ", isBlack=" + isBlack + "]";
	}

}
