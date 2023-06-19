package by.academy.homework3;

public class SportCar {

	double speed;

	public SportCar(double speed) {
		this.speed = speed;
	}

	public SportCar() {
		super();
	}

	@Override
	public String toString() {
		return "SportCar [speed=" + speed + "]";
	}

}
