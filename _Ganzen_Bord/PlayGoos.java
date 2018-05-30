package _Ganzen_Bord;

import java.util.Scanner;

public class PlayGoos {

	public static void main(String[] args) {

		System.out.println("Welcome to the game of Goos Board! \n\n <******************************>");

		Di di = new Di();

		// players and steps
		String player1 = "Alex";

		int steps = 10;

		// array of steps
		int[] arraySteps = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// indicate the positions
		int position1 = arraySteps[0];
		int position2 = arraySteps[1];
		int position3 = arraySteps[2];
		int position4 = arraySteps[3];
		int position5 = arraySteps[4];
		int position6 = arraySteps[5];
		int position7 = arraySteps[6];
		int position8 = arraySteps[7];
		int position9 = arraySteps[8];
		int position10 = arraySteps[9];

		// start position
		int startPosition = arraySteps[0];
		System.out.println("\n" + player1 + " Starts at position number: " + position1 + "\n Please select a number: ");

		// scanner
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();

		// player movements
		for (int i = 0; i < arraySteps.length; i++) {
			System.out.print("Enter Element No." + (i + 1) + ": ");
			arraySteps[i] = sc.nextInt();

			System.out.println(player1 + " Is in the position " + arraySteps[i + userInput]);

		}

	}

}

class Di {

}
