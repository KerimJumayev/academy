package by.academy.homework3;

import java.util.Objects;

public class Car {

	String carCalss;
	Engine engine;
	Driver driver;
	String marka;

	public void star() {
		System.out.println("star to driving");
	}

	public void stop() {
		System.out.println("stop car");
	}

	public void turnLeft() {
		System.out.println("turn Left");
	}

	public void turnRight() {
		System.out.println("turn Right");
	}

	public Car() {
		super();
	}

	public Car(String carCalss, Engine engine, Driver driver, String marka) {
		this.carCalss = carCalss;
		this.engine = engine;
		this.driver = driver;
		this.marka = marka;
	}

	/**
	 * @return the carCalss
	 */
	public String getCarCalss() {
		return carCalss;
	}

	/**
	 * @param carCalss the carCalss to set
	 */
	public void setCarCalss(String carCalss) {
		this.carCalss = carCalss;
	}

	/**
	 * @return the engine
	 */
	public Engine getEngine() {
		return engine;
	}

	/**
	 * @param engine the engine to set
	 */
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	/**
	 * @return the driver
	 */
	public Driver getDriver() {
		return driver;
	}

	/**
	 * @param driver the driver to set
	 */
	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	/**
	 * @return the marka
	 */
	public String getMarka() {
		return marka;
	}

	/**
	 * @param marka the marka to set
	 */
	public void setMarka(String marka) {
		this.marka = marka;
	}

	@Override
	public int hashCode() {
		return Objects.hash(carCalss, driver, engine, marka);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(carCalss, other.carCalss) && Objects.equals(driver, other.driver)
				&& Objects.equals(engine, other.engine) && Objects.equals(marka, other.marka);
	}

	@Override
	public String toString() {
		return "Car [carCalss=" + carCalss + ", engine=" + engine + ", driver=" + driver + ", marka=" + marka + "]";
	}

}
