package by.academy.homework3;

public class Person {

	protected String fullNane;
	protected int age;
	private String fullName;

	public Person() {
		super();
	}

	public Person(String fullNane, int age) {
		this.fullNane = fullNane;
		this.age = age;
	}

	public void move() {
		System.out.println(fullName + "move ");

	}

	public void talk() {
		System.out.println(fullName + "move ");

	}
}
