package by.academy.homework2;

import java.util.Scanner;
import java.util.*;

public class Exersice2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("write words");
		int sc = scan.nextInt();
		scan.nextLine();

		String minSymbol = null;
		int minDistictCount = Integer.MAX_VALUE;

		for (int i = 0; i < sc; i++) {
			String words = scan.nextLine();
			int districtCount = (int) words.chars().distinct().count();
			if (districtCount < minDistictCount) {
				minSymbol = words;
				minDistictCount = districtCount;

			}
		}
		System.out.println("min word symbol" + minDistictCount);
		scan.close();

	}
}
