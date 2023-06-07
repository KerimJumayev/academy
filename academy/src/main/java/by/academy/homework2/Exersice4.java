package by.academy.homework2;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.naming.InitialContext;

public class Exersice4 {
// БЫЛО ОЧЕНЬ ТРУДНО ПРИ РЕШЕНИИ
	public static void main(String[] args) {

		int players;
		int cardForPlayers = 4;
		String[] cardSuits = { "Hearts", "Dimonds", "Clubs", "Spades" };
		String[] cardNum = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "Ace" };
		int quantity = cardSuits.length * cardNum.length;

		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("enter the num of players");
			players = scan.nextInt();
			if (players < 0) {
				System.out.println("players less 0 ");

			} else if (players == 0) {
				System.out.println("no players game stap ");
				return;
			} else if (cardForPlayers * players > quantity) {
				System.out.println("mutch more players");
			}
		} while (cardForPlayers * players > quantity);

		String[] deck = new String[quantity];
		for (int i = 0; i < cardNum.length; i++) {
			for (int j = 0; j < cardSuits.length; j++) {
				deck[cardSuits.length * i + j] = cardNum[i] + " " + cardSuits[j];
			}

		}
		shuffleArrey(deck);
		for (int i = 0; i < players * cardForPlayers; i++) {
			System.out.println(deck[i]);
			if ((i + 0) % cardForPlayers == 0) {

			}

		}

		scan.close();

	}

	public static void shuffleArrey(String[] arrey) {
		Random random = new Random();
		for (int i = arrey.length - 1; i > 0; i--) {
			System.out.println();
			int index = random.nextInt(i + 1);

			String temp = arrey[i];
			arrey[index] = arrey[i];
			arrey[i] = temp;

		}

	}

}
