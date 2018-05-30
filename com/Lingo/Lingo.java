package com.Lingo;

import java.util.Scanner;

public class Lingo {

	public static void main(String[] args) {

		// -array of 5 elements

		String word = "ROO";

		// String[] array = new String[] { "R", "O", "O" };

		System.out.println("There are " + word.length() + " letters in the Box:  \n  ");

		System.out.println("The first Letter starts with -" + "[ " + word.charAt(0) + " ]"
				+ " - Please guess the second letter! \n\n[ " + word.charAt(0) + " ]-[ - ]-[ - ]");

		// -user's input

		Scanner sc = new Scanner(System.in);

		boolean input = sc.hasNextLine();

		// String input = sc.nextLine().toUpperCase();

		char input1 = sc.next().charAt(0);

		char input2 = Character.toUpperCase(input1);

		// show the user input

		System.out.println("  [ " + word.charAt(0) + " ]" + "-[ " + input2 + " ] \n -----------------!!!");

		// -check if the user input equals the letters

		if (input2 == word.charAt(1)) {

			System.out.println("Congratulations! Your Second Letter Is Correct! \n Please Type The Third Letter: ");

		} else {

			System.out.println("Please Try Again!");

		}

		char input3 = sc.next().charAt(0);

		char input4 = Character.toUpperCase(input3);

		if (input4 == word.charAt(2)) {

			System.out.println("Congratulations! You Won The Match!!! ");
			System.exit(0);

		} else {

			System.out.println("Please Try Again!");
			// System.exit(0);

		}

		if (input2 == word.charAt(1)) {

			System.out.println("Congratulations! Your Second Letter Is Correct! \\n Please Type The Third Letter: ");

		} else {

			System.out.println("Sorry!! You Lost The Game.");

		}

		/*
		 * } else if (input4 == word.charAt(2)) {
		 * 
		 * } else if (input2 == word.charAt(1) & input4 != word.charAt(2)) {
		 * 
		 * }
		 */

	}

}

/*
 * char input3 = sc.next().charAt(1);
 * 
 * char input4 = Character.toUpperCase(input3);
 */

/*
 * if (input2 == word.charAt(1)) {
 * 
 * System.out.println("Congratulations! Your Second Letter Is Correct!");
 * 
 * } else if (input2 != word.charAt(1)) {
 * 
 * System.out.println("Please Try Again"); }
 */
// char input = sc.next().charAt(0);
/*
 * if (input.equals(array[1])) {
 * 
 * System.out.println("[ " + array[0] + " ]" + "[ " + array[1] + " ]");
 * 
 * System.out.println("Congratulations! You Won The Match!");
 * 
 * } else {
 * 
 * System.out.println(" - Please Try Again");
 * 
 * }
 */

/*
 * char input3 = input.charAt(0); do {
 * 
 * System.out.println(" - Please guess the second Letter! \n\n  [ R ]-[ - ]");
 * 
 * "Z", "B", "E", "H" }while(!input.equals(array[1])) ;
 */
// continue;

// System.out.println(" - Please guess the second Letter! \n\n [ R ]-[ - ]");

// System.out.println("Congratulations! You Won The Match!");

/*
 * else {
 * 
 * System.out.println("Congratulations! You Won The Match!"); }
 */

// System.out.println(" - Please guess the second Letter! \n\n [ R ]-[ - ]");

/*
 * reset() public MatchResult match() toString()
 * 
 * if (input.matches("[A-Za-z]{1}")) { //valid input } else { //invalid input }
 * 
 */
