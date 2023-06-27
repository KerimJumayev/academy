package by.academy.lesson8;

import java.util.Objects;

public class Dog {
	String nickName;

	public Dog() {
		super();
	}

	public Dog(String nickName) {
		this.nickName = nickName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nickName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		return Objects.equals(nickName, other.nickName);
	}

}
