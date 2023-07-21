package by.academy.cycles.task;

import java.util.Scanner;

public class CyclesWork5 {
//	7. Ввести с клавиатуры 10 пар чисел. сравнить числа в каждой паре и напечатать большие из них.
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter 10 numbers ");
		int sc = scan.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.println("Пара " + i + ": ");
			int firstNumaber = scan.nextInt();
			int secondNumaber = scan.nextInt();

			int maxNumber = Math.max(firstNumaber, secondNumaber);
			System.out.println("Наибольшее число в паре: " + maxNumber);

		}
		scan.close();
	}

}
