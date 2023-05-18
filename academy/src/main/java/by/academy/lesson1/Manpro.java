package by.academy.lesson1;
import java.util.Objects;

public class Manpro {
	
	String name;
	String hairColor;
	String passportNumber;
	
	int ege;
	double weight;
	double height;
	
	public Manpro(String name, String hairColor, String passportNumber, int ege, double weight, double height) {
		this.name = name;
		this.hairColor = hairColor;
		this.passportNumber = passportNumber;
		this.ege = ege;
		this.weight = weight;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Manpro [name=" + name + ", hairColor=" + hairColor + ", passportNumber=" + passportNumber + ", ege="
				+ ege + ", weight=" + weight + ", height=" + height + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ege;
		result = prime * result + ((hairColor == null) ? 0 : hairColor.hashCode());
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((passportNumber == null) ? 0 : passportNumber.hashCode());
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Manpro other = (Manpro) obj;
		if (ege != other.ege)
			return false;
		if (hairColor == null) {
			if (other.hairColor != null)
				return false;
		} else if (!hairColor.equals(other.hairColor))
			return false;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (passportNumber == null) {
			if (other.passportNumber != null)
				return false;
		} else if (!passportNumber.equals(other.passportNumber))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the hairColor
	 */
	public String getHairColor() {
		return hairColor;
	}
	/**
	 * @param hairColor the hairColor to set
	 */
	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
	/**
	 * @return the passportNumber
	 */
	public String getPassportNumber() {
		return passportNumber;
	}
	/**
	 * @param passportNumber the passportNumber to set
	 */
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	/**
	 * @return the ege
	 */
	public int getEge() {
		return ege;
	}
	/**
	 * @param ege the ege to set
	 */
	public void setEge(int ege) {
		this.ege = ege;
	}
	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	
	

}
