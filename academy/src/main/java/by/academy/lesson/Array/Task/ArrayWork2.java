package by.academy.lesson.Array.Task;

import java.util.Arrays;
import java.util.Random;

public class ArrayWork2 {

	public static void main(String[] args) {

//		Задача 2.
//		Создайте массив из всех нечётных чисел от 1 до 99, 
//		выведите его на экран в строку, а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1)

//		int[] array = new int[100];
//
//		Random rand = new Random();
//
//		for (int i = 0; i < array.length; i++) {
//			array[i] = rand.nextInt(100);
//			Arrays.sort(array);
//		}
//		System.out.println(Arrays.toString(array));
		

		int[] array = new int[50];

		for (int i = 0; i < array.length; i++) {
			array[i] = 2 * i + 1;
		}
		System.out.println("Массив в прямом порядке");
		for (int number : array) {
			System.out.println(number + " ");
		}
		for (int i = array.length - 1; i > 0; i--) {
			System.out.println("\\nМассив в обратном порядке:" + array[i]);
		}

//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 == 0) {
//				continue;
//			}
//			System.out.println("ne chotnye: " + i);
//		}
//		for (int j = 100; j >= 0; j--) {
//			if (j % 2 == 0) {
//				continue;
//			}
//			System.out.println("в обратном порядке: " + j);
//
//		}
	}

}
