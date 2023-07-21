package by.academy.cycles.task;

public class CyclesWork7 {
//	9. Даны натуральные числа от 35 до 87. Найти и напечатать те из них, которые при делении на 7 дают остаток 1, 2 или 5.
	public static void main(String[] args) {

		for (int i = 35; i <= 87; i++) {
			int result = i % 7;
			if (result == 1 || result == 2 || result == 5) {
				System.out.println(i + " ");
			}
			// System.out.println(i);
		}

	}

}
