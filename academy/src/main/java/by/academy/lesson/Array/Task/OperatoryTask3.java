package by.academy.lesson.Array.Task;

import java.util.Scanner;

//3. Ввести через консоль название месяца -> вывести номер месяца (использовать switch/case)

public class OperatoryTask3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int sc = scan.nextInt();

		switch (sc) {
		case 1:
			System.out.println(" Mon");
			break;
		case 2:
			System.out.println("Tues ");
			break;
		case 3:
			System.out.println("Wen ");
			break;
		case 4:
			System.out.println("Thu ");
			break;
		case 5:
			System.out.println("Fri ");
			break;
		case 6:
			System.out.println("Satu ");
			break;
		case 7:
			System.out.println("Sun ");
			break;

		}
		
//		Создайте число. Определите, является ли число 
//		четным или не четным, вывести текстовое сообщение.

		if (sc % 2 == 0) {
			System.out.println("number chotnoe ");
		} else {
			System.out.println("number ne chotnoe ");
		}
		scan.close();
	}

}
