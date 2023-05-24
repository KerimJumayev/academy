package by.academy.homework;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" your age");
		int age = sc.nextInt();
		System.out.println("wride your price");

		int a = sc.nextInt();

		if (a >= 100) {
			System.out.println("sale 5% price more than 100");
		}
		if (a < 100) {
			System.out.println("no sale");
		}
		if (a <= 200) {
			System.out.println("sale 7%");
		}
		if (a > 200) {
			System.out.println(" sale 12% price more than 200");
		}
		if (a > 300) {
			System.out.println(" sale 15% price more than 300");
		}
		if (a <= 400) {
			System.out.println("jojo");
		}
		if (a > 400) {
			System.out.println("sale 21% price more than 400");
		}
		if (age > 18) {
			System.out.println("plus 4% to the sale");
		}else {
			System.out.println("plus sale 3%");
		}
		
		sc.close();
		

	}


}
