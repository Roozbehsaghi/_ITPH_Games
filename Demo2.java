
public class Demo2 {

	public static void main(String[] args) {

		Car[] array = new Car[5];

		for (int i = 0; i < array.length; i++) {

			System.out.println(array);

		}
	}

}

class Car {

	int price;

	Car(int prijs) {

		this.price = prijs;
	}

}