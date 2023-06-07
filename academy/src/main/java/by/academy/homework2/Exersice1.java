package by.academy.homework2;

import java.util.Scanner;

public class Exersice1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("write fitst String");
		String sc = scan.nextLine();
		System.out.println("write second string");
		String sc2 = scan.nextLine();

		scan.close();

		System.out.println(sc.equals(sc2));

	}

}
