package com.Yahtzee;

import java.util.Random;

public class Yahtzee {
	Player[] players = new Player[2];
	Player activePlayer;
	
	void start() {
		

		Player player1 = new Player();

		Player player2 = new Player();

		player1.name = "Bart";
		player2.name = "Alex";

		players[0] = player1;
		players[1] = player2;
		activePlayer = players[toss()];
		System.out.println(activePlayer.name);
		System.out.println("starts the game");
		for(int a = 0 ; a < 5 ; a++) {
			System.out.println(activePlayer.name + "Is rolling dice");
			activePlayer = flipper(activePlayer);
			System.out.println("has thrown " + throwDice());
		}
		
	}
	int throwDice() {
		
		Random random = new Random();
		
		return random.nextInt(6)+1;
		
		
	}
	int toss() {

		Random random = new Random();

		return random.nextInt(2);

	}
	Player flipper(Player player) {
		if(players[0].name == player.name) {
			return players[1];
		}else {
			return players[0];
		}

	}

}
