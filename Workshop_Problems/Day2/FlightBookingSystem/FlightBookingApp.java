package Day2.FlightBookingSystem;

import java.util.List;
import java.util.Scanner;

public class FlightBookingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlightBookingSystem system = new FlightBookingSystem();

        while (true) {
            System.out.println("\n--- Flight Booking System ---");
            System.out.println("1. Search Flights");
            System.out.println("2. Book Flight");
            System.out.println("3. View Bookings");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter source: ");
                    String source = scanner.nextLine();
                    System.out.print("Enter destination: ");
                    String destination = scanner.nextLine();
                    List<Flight> flights = system.searchFlights(source, destination);
                    if (flights.isEmpty()) {
                        System.out.println("No flights found.");
                    } else {
                        System.out.println("Available flights:");
                        for (int i = 0; i < flights.size(); i++) {
                            System.out.println((i + 1) + ". " + flights.get(i));
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter passenger name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter flight number to book: ");
                    String flightNumber = scanner.nextLine();

                    boolean booked = false;
                    for (Flight f : system.searchFlights("", "")) {
                        if (f.flightNumber.equalsIgnoreCase(flightNumber)) {
                            system.bookFlight(name, f);
                            booked = true;
                            break;
                        }
                    }
                    if (!booked) {
                        System.out.println("Flight not found.");
                    }
                    break;

                case 3:
                    system.viewBookings();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
