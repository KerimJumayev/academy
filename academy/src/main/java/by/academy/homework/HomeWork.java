package by.academy.homework;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" your age");
		int age = sc.nextInt();
		System.out.println("wride your price");

		int price = sc.nextInt();

		if (price < 100) {
			System.out.println("sale 5%");
		} else if (price > 100 && price < 200) {
			System.out.println("sale 7%");
		} else if (price > 200 && price < 300) {
			System.out.println("sale 12%");
			if (age > 18)
				System.out.println("plus for sale 4 %");
			else if (age < 18) {
				System.out.println("minus 3% off your sale");

			}

		} else if (price > 300 && price < 400) {
			System.out.println("sale 15%");
		} else if (price > 400) {
			System.out.println("sale 20%");
		}

		sc.close();

	}

}
