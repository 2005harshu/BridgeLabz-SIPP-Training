package HybridInheritance.VehicleSystem;

public class Vehicle {
	  int maxSpeed;
	    String model;

	    public Vehicle(int maxSpeed, String model) {
	        this.maxSpeed = maxSpeed;
	        this.model = model;
	    }

	    public void displayDetails() {
	        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
	    }

}
