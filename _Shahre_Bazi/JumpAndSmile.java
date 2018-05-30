package _Shahre_Bazi;

public class JumpAndSmile extends AmusementRide {
	
	private static double PRICE = 2.25;
	public static int counter;

	@Override
	public void rideAndSell() {
		
		System.out.println("Thank you for choosing JumpAndSmile");
	}
	public JumpAndSmile() {
		
		this.name = "Jump And Smile";
		
		counter++;
		
	}

}
