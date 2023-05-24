package by.academy.homework;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("type num 1 to 10");
		int x = sc.nextInt();

		for (int i = 0; i < 11; i++) {
			
			System.out.println(x + "*" + i + "=" + i*x);
		}
		sc.close();

	}

}
