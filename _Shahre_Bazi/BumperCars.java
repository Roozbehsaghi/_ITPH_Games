package _Shahre_Bazi;

public class BumperCars extends AmusementRide {
	
	 public static final double price = 2.50;
	 private static int counter;
	 
	@Override
	public void rideAndSell() {
		
		System.out.println("Thank you for choosing BumperCars");
	}
	public BumperCars() {
		
		this.name = "Bumper Cars";
		
		counter++;
		
	}
		
	public String toString() {
		
		return name = this.name+"Bumper Cars "+ this.price;
		
	}
	

}
