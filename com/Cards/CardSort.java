package com.Cards;

import java.util.Random;
import java.util.Scanner;

public class CardSort {

	public static void main(String[] args) {

		System.out.println("how many cards do we have? ");

		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();

		int[] numbers = new int[input];

/*		for (int i = 1; i <= input; i++) {

			System.out.println(i);
		}*/

		// declaration of suits and ranks

		int[] deck = new int[52];

		String[] suits = { "Hearts", "Diamonds", "Spades", "Clubs" };

		String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

		  // Initialize cards
		
	/*	for (int i = 0; i < deck.length; i++) {

			deck[i] = i;

		}*/

	/*	for (int i = 0; i < 52; i++) {

			String suit = suits[deck[i] / 13];

			String rank = ranks[deck[i] % 13];

		//	System.out.println(rank + " of " + suit);
*/			
			Random random = new Random(2);

			int num = random.nextInt(ranks.length * suits.length)*input;
			
		//	System.out.println (ranks[num % ranks.length] +" of "+ suits[num / suits.length]);
			
			System.out.println ((num % ranks.length) +" of "+ (num / suits.length));

		

	}

}
