package by.academy.lesson12;

import java.io.Serializable;

public class Cat extends Animal implements Comparable, Serializable {
	
	public Cat(String name) {
		super(name, null, null);
	}

	public void say() {
		System.out.println("muurr");
	}

	@Override
	public int compareTo(Object o) {
		return 0;
	}
}
