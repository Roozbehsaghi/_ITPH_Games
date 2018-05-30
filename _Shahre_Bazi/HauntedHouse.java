package _Shahre_Bazi;

public class HauntedHouse extends AmusementRide {
	
	private static double PRICE = 3.20;
	public static int counter;

	@Override
	public void rideAndSell() {

		System.out.println("Thank you for choosing HauntedHouse");
	}
	public HauntedHouse() {
		
		this.name = "Haunted House";
		
		counter++;
		
	}

}
