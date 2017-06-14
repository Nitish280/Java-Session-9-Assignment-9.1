
abstract class Vehicle{

	abstract void Drive();
}

class Bike extends Vehicle {

	@Override
	void Drive() {
		System.out.println("Drink and drive is not allowed");

	}

	
}

public class Bikedemo {
	public static void main(String args[]) {
		Vehicle obj = new Bike();
		obj.Drive();
	}
}
