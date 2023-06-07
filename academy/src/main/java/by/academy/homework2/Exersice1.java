package by.academy.homework2;

import java.util.Scanner;

public class Exersice1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("write fitst String");
		String fitrsWord = scan.nextLine();
		System.out.println("write second string");
		String secondWord = scan.nextLine();
		boolean result = checkResult(fitrsWord, secondWord);
		if(result) {
			System.out.println("One line is a permutation of another line");
		}else {
			System.out.println("The strings are not permutations of each othe");
		}
		
		System.out.println("Result: " + result);

		scan.close();
		
	}

	public static boolean checkResult(String fitrsWord, String secondWord) {
		if (fitrsWord.length() != secondWord.length()) {
			return false;
		}

		int[] charCount = new int[128];
		for (int i = 0; i < fitrsWord.length(); i++) {
			char c = fitrsWord.charAt(i);
			charCount[c]++;

		}
		for (int i = 0; i < secondWord.length(); i++) {
			char c = secondWord.charAt(i);
			charCount[c]--;
			if (charCount[c] < 0);{
				return false;
			}
		}
		return true;
	}
}
