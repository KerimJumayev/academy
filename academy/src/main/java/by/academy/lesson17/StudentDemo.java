package by.academy.lesson17;

import java.util.ArrayList;

public class StudentDemo {

	public static void main(String[] args) {

		ArrayList<Student> array = new ArrayList<>();
		ArrayList<Integer> index = new ArrayList<>();

		array.add(new Student("wowo", 2, 3, 5));
		array.add(new Student("wowo", 7, 3, 3));
		array.add(new Student("wowo", 5, 3, 6));
		array.add(new Student("wowo", 1, 8, 7));

		for (int i = 0; i < array.size(); i++) {
			if (array.get(i).getMarks() <= 3) {
				index.add(i);

			}

		}
		for (int i = array.size() - 1; i >= 0; i--) {
			if (index.contains(i)) {
				array.remove(i);
			}
		}
		System.out.println(array);
	}
}
