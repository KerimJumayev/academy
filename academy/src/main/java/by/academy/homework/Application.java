package by.academy.homework;

public class Application {

	public static void main(String[] args) {
		 Cat cat1 = new Cat();

			System.out.println(cat1);
			Cat cat2 = new Cat("jojo ", " grey ", 5, 8.0);
			System.out.println(cat2);
			cat1.eat();
			System.out.println(cat1);
			cat2.sleep();
			System.out.println(cat2);
			cat2.walk();
			System.out.println(cat2);
			cat2.walk();
			System.out.println(cat2);
			cat2.setMoney(100);
			System.out.println("Cat name " + cat2.nickname + " , have  " + cat2.getMoney() + " maney");
			cat2.setInitials('B');
			System.out.println("Cat num " + cat2.getInitials());
			cat2.setHomeAnimal(true);
			System.out.println("Cat " + cat2.nickname + "home Cat  " + cat2.isHomeAnimal());
			cat1.grow();
			System.out.println(cat1);
			cat1.grow();
			System.out.println(cat1);
			cat1.grow();
			System.out.println(cat1);

	}
	

}
