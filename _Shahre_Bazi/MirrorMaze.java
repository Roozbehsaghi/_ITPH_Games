package _Shahre_Bazi;

public class MirrorMaze extends AmusementRide {
	
	private static double PRICE = 2.75;
	public static int counter;

	@Override
	public void rideAndSell() {

		System.out.println("Thank you for choosing MirrorMaze");
	}
	public MirrorMaze() {
		
		this.name = "Mirror Maze";
		
		counter++;
		
	}

}
