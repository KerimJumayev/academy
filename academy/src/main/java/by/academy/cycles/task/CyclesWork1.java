package by.academy.cycles.task;

import java.util.Scanner;

public class CyclesWork1 {

	public static void main(String[] args) {

//		1. Составьте программу, выводящую на экран квадраты чисел от 10 до 20.

		for (int i = 10; i <= 20; i++) {
			System.out.println("i = " + i * i);
		}

//		2. Составьте программу, которая вычисляет сумму чисел от 1 до n. 
//		Значение n вводится с клавиатуры.

		Scanner scan = new Scanner(System.in);
		System.out.println("write num: ");
		int sc = scan.nextInt();
		scan.close();
		int result = 1;
		for (int i = 0; i <= sc; i++) {
			result = result + i;
		}
		System.out.println("сумму чисел: " + result);

	}

}
