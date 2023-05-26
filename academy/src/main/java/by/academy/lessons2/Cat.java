package by.academy.lessons2;

public class Cat {

	Cat cat1 = new Cat();
	int age;
	String nickname;
	String color;
	double weight;
	int money;
	char initials;
	boolean isHomeAnimal;

	public Cat() {

	}

	public Cat(String nickname, String color, int age, double weight) {
		this.age = age;
		this.nickname = nickname;
		this.color = color;
		this.weight = weight;
//		 this.eat();
//		 this.grow();
//		 this.sleep();
//		 this.walk();
	}

	public void grow() {
		age = age + 1;
		
	}

	public void sleep() {	
		System.out.println( "Cat"+nickname + "sleep");

	}

	public void eat() {
		weight = weight + 1;
		System.out.println(nickname+"eat"+"Cat"+ weight);

	}

	public void walk() {
		weight = weight -1;
		System.out.println( nickname+ "Cat walk"+ weight);

	}
	public int getMoney() {
		return money;

	}

	public Cat(String nickname) {

	}
	public void setMoney(int money) {
		this.money = money;
	}

	public char getInitials() {
		return initials;
	}

	public void setInitials(char initials) {
		this.initials = initials;
	}

	public boolean isHomeAnimal() {
		return isHomeAnimal;
	}

	public void setHomeAnimal(boolean isHomeAnimal) {
		this.isHomeAnimal = isHomeAnimal;
	}

	@Override
	public String toString() {
		return "Cat [cat1=" + cat1 + ", age=" + age + ", nickname=" + nickname + ", color=" + color + ", weight="
				+ weight + ", money=" + money + ", initials=" + initials + ", isHomeAnimal=" + isHomeAnimal + "]";
	}
	

}
