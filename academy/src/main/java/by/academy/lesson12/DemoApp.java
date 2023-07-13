package by.academy.lesson12;

public class DemoApp {

	public static void main(String[] args) {

		ClassWork <String,Cat,Integer>  str = new ClassWork<>("T", new Cat("super cat"),123456789);
		
		str.printClasses();
	}
}
