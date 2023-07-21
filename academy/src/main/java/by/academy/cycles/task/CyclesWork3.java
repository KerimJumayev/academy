package by.academy.cycles.task;

import java.util.Scanner;

public class CyclesWork3 {
//	4. С клавиатуры вводятся n чисел. 
//	Составьте программу, которая определяет кол-во отрицательных,
//	кол-во положительных и кол-во нулей среди введеных чисел.
//	Значение n вводится с клавиатуры.ние n вводится с клавиатуры.
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("write num");
		int sc = scan.nextInt();
		scan.close();
//нужно доработать
		for (int i = 0; i <= 0; i++) {
			if (sc > 0) {
				System.out.println("positive");
			} else if (sc < 0) {
				System.out.println("negative");
			} else {
				System.out.println("zero");

			}
		}

	}

}
