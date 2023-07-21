package by.academy.lesson.Array.Task;

import java.util.Arrays;

public class ArrayClassWorkSort1 {
// сортировка / ерестановка двух элементов / buble
	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, };

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}

		}

		System.out.println(Arrays.toString(array));

	}

}
