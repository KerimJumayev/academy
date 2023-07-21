package by.academy.cycles.task;

public class CyclesWork8 {
//	10. Даны натуральные числа от 1 до 50. Найти сумму тех из них, которые делятся на 5 или на 7.

	public static void main(String[] args) {

		for (int i = 1; i <= 50; i++) {
			int result = i % 7;
			result *=i;
			System.out.println(result);
		}

	}

}
