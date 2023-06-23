package by.academy.lesson12;
////6.  а) Создать обобщенный класс с тремя параметрами (T, V, K). Класс содержит три переменные типа 

import java.io.Serializable;

//(T, V, K), конструктор, принимающий на вход параметры типа (T, V, K), методы возвращающие значения 
//трех переменных. Создать метод, выводящий на консоль имена классов для трех переменных класса.
////б) Наложить ограничения на параметры типа: T должен реализовать интерфейс Comparable (классы
//-оболочки, String), V должен реализовать интерфейс Serializable и расширять класс Animal, K должен расширять класс Number.

public class ClassWork<T extends Comparable<String>, V extends Animal & Serializable, K extends Number> {

	private T t;
	private V v;
	private K k;

	public ClassWork(T t, V v, K k) {
		this.t = t;
		this.v = v;
		this.k = k;
	}

	/**
	 * @return the t
	 */
	public T getT() {
		return t;
	}

	/**
	 * @param t the t to set
	 */
	public void setT(T t) {
		this.t = t;
	}

	/**
	 * @return the v
	 */
	public V getV() {
		return v;
	}

	/**
	 * @param v the v to set
	 */
	public void setV(V v) {
		this.v = v;
	}

	/**
	 * @return the k
	 */
	public K getK() {
		return k;
	}

	/**
	 * @param k the k to set
	 */
	public void setK(K k) {
		this.k = k;
	}

	public void printClasses() {
		System.out.println(t.getClass());
		System.out.println(v.getClass());
		System.out.println(k.getClass());

	}

}
