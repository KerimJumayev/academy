package by.academy.homework2;

import java.util.Scanner;

public class Exersice1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("write String");
		String sc = scan.nextLine();
		String sc2 = scan.nextLine();

		System.out.println(sc.equals(sc2));
		scan.close();

	}

}
