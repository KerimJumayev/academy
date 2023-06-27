package by.academy.lesson8;

public class DogDemo {

	public static void main(String[] args) {
		
		
		
		Dog dog0 = new Dog("sharik");
		Dog dog1 = new Dog("bobik");
		Dog dog2 = new Dog("bobik");
		
		
		System.out.println(dog0.equals(dog1));
		System.out.println(dog1.equals(dog2));
		System.out.println(dog2.equals(dog2));
				

	}

}
