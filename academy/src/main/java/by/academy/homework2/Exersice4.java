package by.academy.homework2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.naming.InitialContext;

public class Exersice4 {

	public static void main(String[] args) {
//
		Scanner scan = new Scanner(System.in);
		System.out.println("how many players");
		String sc = scan.next();

		int[] arreyCard = new int[62];
		Random rand = new Random();
		for (int i = 0; i < arreyCard.length; i++) {
			arreyCard[i] = rand.nextInt(62 );

		}
		for (int element : arreyCard) {
			System.out.println(element);
		}

		System.out.println(Arrays.toString(arreyCard));

	}

}
