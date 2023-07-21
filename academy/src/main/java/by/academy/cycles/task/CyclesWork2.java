package by.academy.cycles.task;

import java.util.Scanner;

public class CyclesWork2 {

	public static void main(String[] args) {
//		3. Составьте программу, которая вычисляет произведение чисел от 1 до n. Значение n
//		 вводится с клавиатуры

		Scanner scan = new Scanner(System.in);
		System.out.println("write num");
		int sc = scan.nextInt();
		scan.close();
		int result = 1;
		for (int i = 1; i <= sc; i++) {
			result = result * i;
		}
		System.out.println("произведение чисел от 1 до: " + result);

// найти первое число из отрезка [17,28] которая нацело делится на 13
		int num = 17;
		while (17 <= 28) {
			if (num % 13 == 0) {
				break;
			}
			num++;
		}
		System.out.println("первое число которая нацело делится на 13: " + num);
	}

}
