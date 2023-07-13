package by.academy.homework4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayD<T> {

	private T[] array;
	private int size;

	public ArrayD() {
		super();
		array = (T[]) new Object[16];
		size = 0;
	}

	public ArrayD(int n) {
		this.array = (T[]) new Object[n];
		size = 0;
	}

	public void add(T element) {
		if (size == array.length) {
			array = Arrays.copyOf(array, array.length * 2);
		}
	}

	public T get(int index) {
		if (index < 0 || index >= size) {
			System.out.println("no such element exists");
		}
		return array[index];

	}

	public T getLast() {
		int last = size;
		return array[last--];

	}

	public T getFirst() {
		int first = size;
		return array[--first];
	}

	public void printArraySize() {
		System.out.println("array size " + array.length);
	}

	public void lastIndexArray() {
		int lastIndex = 0;
		System.out.println("last index array " + (--lastIndex));
	}

	public T[] remove(int index) {
		// удаление элемента по индексу (remove(int i)
		if (index < 0 || index >= size) {
			System.out.println("no such element exists");
		}
		List<T> list = new ArrayList<>(Arrays.asList(array));
		list.remove(index);
		array = (T[]) list.toArray(new Object[list.size()]);
		return array;

	}

	public T[] removeObj(T object) {
		List<T> list = new ArrayList<>(Arrays.asList(array));
		list.remove(object);

		array = (T[]) list.toArray(new Object[list.size()]);
		size--;
		return array;
//		удаление элемента по значению (remove(T obj))

	}

	@Override
	public String toString() {
		return "ArrayD [array=" + Arrays.toString(array) + ", size=" + size + "]";
	}

}
