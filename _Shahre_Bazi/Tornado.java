package _Shahre_Bazi;

public class Tornado extends AmusementRide{
	
	private static double PRICE = 5.00;
	public static int counter;
	
	@Override
	public void rideAndSell() {
		
		System.out.println("Thank you for choosing Tornado");
	}
	public Tornado() {
		
		this.name = "Tornado";
		
		counter++;
		
	}

}
