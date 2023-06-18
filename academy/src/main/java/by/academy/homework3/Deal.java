package by.academy.homework3;

import java.util.Arrays;
import java.util.Objects;

public class Deal {

	String addres;
	User buyer;
	User seller;
	Products[] products;

	public Deal(String addres, User buyer, User seller, Products[] products) {
		this.addres = addres;
		this.buyer = buyer;
		this.seller = seller;
		this.products = products;
	}

	public int calcPrice() {
		int price = 0;
		for (Products p : products) {
			if (p == null) {
				continue;
			}

			price += p.calcFullPrice();
		}
		return price;
	}

	/**
	 * @return the addres
	 */
	public String getAddres() {
		return addres;
	}

	/**
	 * @param addres the addres to set
	 */
	public void setAddres(String addres) {
		this.addres = addres;
	}

	/**
	 * @return the buyer
	 */
	public User getBuyer() {
		return buyer;
	}

	/**
	 * @param buyer the buyer to set
	 */
	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	/**
	 * @return the seller
	 */
	public User getSeller() {
		return seller;
	}

	/**
	 * @param seller the seller to set
	 */
	public void setSeller(User seller) {
		this.seller = seller;
	}

	/**
	 * @return the products
	 */
	public Products[] getProducts() {
		return products;
	}

	/**
	 * @param products the products to set
	 */
	public void setProducts(Products[] products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Deal [addres=" + addres + ", buyer=" + buyer + ", seller=" + seller + ", products="
				+ Arrays.toString(products) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(products);
		result = prime * result + Objects.hash(addres, buyer, seller);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deal other = (Deal) obj;
		return Objects.equals(addres, other.addres) && Objects.equals(buyer, other.buyer)
				&& Arrays.equals(products, other.products) && Objects.equals(seller, other.seller);
	}

}