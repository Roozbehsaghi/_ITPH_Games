package _Shahre_Bazi;

public class TopSpin extends AmusementRide {
	
	private static double PRICE = 2.90;
	public static int counter;

	@Override
	public void rideAndSell() {
		
		System.out.println("Thank you for choosing TopSpin");
	}
	public TopSpin() {
		
		this.name = "Top Spin";
		
		counter++;
		
	}

}
