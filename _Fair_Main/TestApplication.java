package _Fair_Main;

import java.util.Scanner;

import _Fair.*;

public class TestApplication {

	public static void main(String[] args) {
		System.out.println(" Please choose an option");
		System.out.println("1-BumperCars\n2-JumpAndSmile\n3-MirrorMaze\n4-HaunterHouse\n5-TopSpin\n6-Tornado\n7-quite");
		Scanner scanner=new Scanner(System.in); 
		String input="";
		AmusementRide am=new AmusementRide();
		while(scanner.hasNext()) {
			input=scanner.nextLine();
		switch(input) {
		case "1":
			BumperCars obj=new BumperCars();
			am.sell(obj);
			am.run(obj);
			break;
		case "2":
			
		}
		}
	}

}
