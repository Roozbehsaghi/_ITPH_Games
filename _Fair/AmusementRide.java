package _Fair;

public class AmusementRide implements Moveable {
	public String name,runningText;
	public double price;
	
	public void sell(AmusementRide obj) {
		System.out.println(obj.name);
	}
		
	public void run(AmusementRide obj) {
		System.out.println(obj.runningText);

	}

}
