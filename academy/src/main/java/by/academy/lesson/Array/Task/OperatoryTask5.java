package by.academy.lesson.Array.Task;

import java.util.Scanner;

//5. Ввести с консоли 2 числа, найти большее, меньшее, 
//среднее арифметическое.
public class OperatoryTask5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("type first num");
		int num1 = scan.nextInt();

		System.out.println("type first num");
		int num2 = scan.nextInt();

		double average = (num1 + num2) / 2;

		if (num1 > num2) {
			System.out.println("first num gigger than second");
		} else {
			System.out.println("second gigger than first ");
		}
		System.out.println("Среднее арифметическое: " + average);
		scan.close();	
	
		
		
	// или можно решить вот так:
		
//		System.out.println("Введите первое число:");
//        Scanner scanner = new Scanner(System.in);
//		int number1 = scanner.nextInt();
//
//        System.out.println("Введите второе число:");
//        int number2 = scanner.nextInt();
//
//        int max = Math.max(number1, number2);
//        int min = Math.min(number1, number2);
//        double averageg = (double) (number1 + number2) / 2;
//
//        System.out.println("Наибольшее число: " + max);
//        System.out.println("Наименьшее число: " + min);
//        System.out.println("Среднее арифметическое: " + averageg);
//
//        scanner.close();
	}

}
