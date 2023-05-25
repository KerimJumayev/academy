package by.academy.homework;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("type number");

		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			num = num * i;

			System.out.println(num + " v stepeni" + " " + num * 2);

		}
		sc.close();

	}

}
