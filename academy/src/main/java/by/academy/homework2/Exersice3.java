package by.academy.homework2;

import java.util.Scanner;

public class Exersice3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("write word");
		String str1 = scan.next();
		String str2 = scan.next();
		System.out.println("first word:" + " " + str1);
		System.out.println("second word:" + " " + str2);
		String str3 = (str1.substring(0, str1.length() / 2) + str2.substring(str2.length() / 2, str2.length()));
		System.out.println(str3);

		scan.close();
	}

}
