package by.academy.homework2;

import java.util.Scanner;

public class Exersice3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("write word");
		String sc = scan.nextLine();
		String sc2 = scan.nextLine();
//		String str1 = "";
//		String str2 = "";
		String str3 = sc + " " + 13 / 2 + sc2;
		
		System.out.println(str3);
		
		scan.close();
	}
	

}
