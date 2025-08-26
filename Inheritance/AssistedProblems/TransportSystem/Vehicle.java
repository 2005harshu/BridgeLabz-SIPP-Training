package TransportSystem;

public class Vehicle {
	 int maxSpeed;
	 String fuelType;

	  public Vehicle(int maxSpeed, String fuelType) {
	       this.maxSpeed = maxSpeed;
	       this.fuelType = fuelType;
	  }
	  public void displayInfo() {
	       System.out.println("Speed: " + maxSpeed + " km/h, Fuel: " + fuelType);
	  }

}
