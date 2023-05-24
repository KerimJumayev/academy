package by.academy.lesson1;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("type name");
		String name = sc.next();
		
		System.out.println("type hair color");
		String hairColor = sc.next();
		
		System.out.println("type passpor");
		String passportNumber = sc.next();

		System.out.println("type age");
		int ege = sc.nextInt();

		System.out.println("type weight");
		double weight = sc.nextDouble();

		System.out.println("type height");
		double height = sc.nextDouble();

		sc.close();

		Manpro man = new Manpro(name, hairColor, passportNumber, ege, weight, height);

		System.out.println(man);

	}

}
