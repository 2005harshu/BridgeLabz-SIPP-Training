package HybridInheritance.VehicleSystem;

public class Main {
	 public static void main(String[] args) {
	        ElectricVehicle ev = new ElectricVehicle(150, "Tesla Model 3");
	        PetrolVehicle pv = new PetrolVehicle(180, "Honda City");

	        ev.displayDetails();
	        ev.charge();

	        System.out.println("---");

	        pv.displayDetails();
	        pv.refuel();
	    }

}
