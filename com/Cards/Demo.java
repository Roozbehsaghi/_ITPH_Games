package com.Cards;

import java.util.Random;

public class Demo {

	public static void main(String[] args) {

		Dealer dealer = new Dealer();
		int number = dealer.generateRandomNumber();
		Card card = dealer.getCardFromNumber(number);
		System.out.println(card.suit);
		// testFunctionality();
	}

	static void testFunctionality() {
		Dealer dealer = new Dealer();
		int number = dealer.generateRandomNumber();
		System.out.println(number);
	}
}

class Card {
	String suit;
	String value;
}

class Dealer {
	int generateRandomNumber() {
		Random random = new Random();
		int generatedNumber = random.nextInt(52);
		return generatedNumber;
	}

	Card getCardFromNumber(int deckNumber) {
		Card card = new Card();
		card.suit = "Spades";
		return card;

	}

}
