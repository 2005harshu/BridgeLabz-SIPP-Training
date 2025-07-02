package TransportSystem;

public class Truck extends Vehicle {
	double loadCapacity;

    public Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Truck Load Capacity: " + loadCapacity + " tons");
    }

}
