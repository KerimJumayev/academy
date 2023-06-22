package by.academy.homework3;

import java.util.Objects;

public class Banana extends Products {

	int colv;

	public Banana(String name, int price, int quantity, int colv) {
		super(name, price, quantity);
		this.colv = colv;

	}

	@Override
	public int disCount() {
		if (quantity > 5) {
			return 7;
		}

		return 1;
	}

	/**
	 * @return the colv
	 */
	public int getColv() {
		return colv;
	}

	/**
	 * @param colv the colv to set
	 */
	public void setColv(int colv) {
		this.colv = colv;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(colv);
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
		Banana other = (Banana) obj;
		return colv == other.colv;
	}

	@Override
	public String toString() {
		return "Banana [colv=" + colv + "]";
	}

}
