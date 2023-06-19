package by.academy.homework3;

public class Engine {

	int power;
	String company;

	public Engine(int power, String company) {
		this.power = power;
		this.company = company;
	}

	public Engine() {
		super();
	}

	@Override
	public String toString() {
		return "Engine [power=" + power + ", company=" + company + "]";
	}

}
