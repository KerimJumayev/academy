package by.academy.lesson8;

public class Phone {

	String number;
	String model;
	int weight;
	String nameCall;
	int getNumber;

	public Phone(String number, String model, int weight) {
		this.number = number;
		this.model = model;
		this.weight = weight;
		this.nameCall = nameCall;
		this.getNumber = getNumber;

		System.out.println("Phone ");

	}

	public void receiveCall(String name) {
		System.out.println("Call for you" + name);
	}
	public Phone(String numbber, String model) {
		
	}

	public String getNumber(String number) {
		return number;
	}

	public void name() {

	}

	public Phone() {
		super();
	}

}
//1.  Класс Phone.
//a) Создайте класс Phone, который содержит переменные number, model и weight.
//б) Создайте три экземпляра этого класса. 
//в) Выведите на консоль значения их переменных. 
//г) Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”. getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
//д) Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight. 
//е) Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model. 
//ж) Добавить конструктор без параметров.
//з) Вызвать из конструктора с тремя параметрами конструктор с двумя.
