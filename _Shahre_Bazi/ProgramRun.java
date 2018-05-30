package _Shahre_Bazi;

import java.util.Scanner;

public class ProgramRun {

	public static void main(String[] args) {
		menu();
		Scanner sc = new Scanner(System.in);
		AmusementRide amusementRide=null;
		
		
		while (sc.hasNext()) {


			String keyPress = sc.nextLine();

			switch (keyPress) {

			case "1":
				amusementRide = new BumperCars();
				break;

			case "2":
				amusementRide = new JumpAndSmile();
				break;

			case "3":
				amusementRide = new MirrorMaze();
				break;

			case "4":
				amusementRide = new HauntedHouse();
				break;

			case "5":
				amusementRide = new TopSpin();
				break;

			case "6":
				amusementRide = new Tornado();
				break;
				
			case "7":
				menu();
				break;
			case "q":

			case "Q":
				System.out.println("Thank you for using our program!");
				System.exit(0);
				break;

			default:
				System.out.println("Please choose a right option!");
				//break;
			}

			amusementRide.rideAndSell();

		}

	}

	public static void menu() {
		
		System.out.println(
				"Please select one of your options:\n"
				+ "1-BumperCars\n2-JumpAndSmile\n"
				+ "3-MirrorMaze\n4-HauntedHouse\n"
				+ "5-TopSpin\n6-Tornado\n"
				+ "7-press M to show the menu\n8-press Q to exit");

	}

}
