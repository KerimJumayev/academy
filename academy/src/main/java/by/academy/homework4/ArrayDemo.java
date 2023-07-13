package by.academy.homework4;

import java.sql.Array;

public class ArrayDemo {

	public static void main(String[] args) {

		ArrayD<Object> array = new ArrayD<>();

		array.add(7);
		array.add(5);
		array.add(9);
		array.add("h");
		array.add(5);
		array.add("L");
		System.out.println(array.toString());
		System.out.println();

		System.out.println("Элемент по индексу: " + array.get(3));
		System.out.println("Первый элемент: " + array.getFirst());
		System.out.println("Последниий элемент: " + array.getLast());
		array.printArraySize();
		array.lastIndexArray();
		array.remove(0);
		System.out.println(array.toString());

	}

}
