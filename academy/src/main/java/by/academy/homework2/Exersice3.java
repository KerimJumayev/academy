package by.academy.homework2;

import java.util.Scanner;

public class Exersice3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("write 2 words");
		String str1 = scan.next();
		String str2 = scan.next();
		if (str1.length() % 2 != 0 && str2.length() % 2 != 0) {
			System.out.println("words must have an even n   umber of symbols");
			return;
		}
		String str3 = (str1.substring(0, str1.length() / 2) + str2.substring(str2.length() / 2, str2.length()));
		System.out.println(str3);
		// scan.useDelimiter(str3);

		scan.close();
	}

}
