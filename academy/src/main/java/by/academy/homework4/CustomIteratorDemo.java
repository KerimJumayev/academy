package by.academy.homework4;

public class CustomIteratorDemo {

	public static void main(String[] args) {

		String[] array1 = { "banana", "apple", "kivi", "orange" };

		CustomIterator<String> interato1 = new CustomIterator<>(array1);

		while (interato1.hasNext()) {
			System.out.println(interato1.next());
		}

		Integer[] array2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		CustomIterator<Integer> interato2 = new CustomIterator<>(array2);

		while (interato2.hasNext()) {
			System.out.println(interato2.next());
		}

	}

}
