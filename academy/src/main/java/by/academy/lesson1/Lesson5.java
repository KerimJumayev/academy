package by.academy.lesson1;

import java.util.Arrays;

public class Lesson5 {

	public static void main(String[] args) {

		String[] array = new String[7];

		for (int i = 0; i < array.length; i++) {
			array[i] = Arrays.toString(array);
			array[0] = "Man";
			array[1] = "Tuesday";
			array[2] = "Wendnesday";
			array[3] = "Thusday";
			array[4] = "Friday";
			array[5] = "Saturday";
			array[6] = "Sundey";

		}
		System.out.println(Arrays.toString(array));

	}

}
