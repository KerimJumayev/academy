package by.academy.lesson.Array.Task;

import java.util.Arrays;

//Задача 1. Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку, 
//отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки). 
//Перед созданием массива подумайте, какого он будет размера.
public class ArrayWork1 {

	public static void main(String[] args) {

		int[] array1 = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		System.out.print(Arrays.toString(array1) + " ");

		for (int i = 0; i < array1.length; i++) {
			System.out.println("array [" + i + "] = " + array1[i]);

		}

	}

}
