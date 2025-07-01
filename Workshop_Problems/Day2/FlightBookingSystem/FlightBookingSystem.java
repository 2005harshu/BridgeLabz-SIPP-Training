package Day2.FlightBookingSystem;

import java.util.ArrayList;
import java.util.List;

public class FlightBookingSystem {
    private Flight[] flights;
    private List<Booking> bookings;

    public FlightBookingSystem() {
        // Sample flight data
        flights = new Flight[] {
            new Flight("AI101", "Delhi", "Mumbai"),
            new Flight("AI102", "Mumbai", "Bangalore"),
            new Flight("AI103", "Delhi", "Chennai"),
            new Flight("AI104", "Kolkata", "Delhi")
        };
        bookings = new ArrayList<>();
    }

    public List<Flight> searchFlights(String source, String destination) {
        List<Flight> result = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.source.equalsIgnoreCase(source) &&
                flight.destination.equalsIgnoreCase(destination)) {
                result.add(flight);
            }
        }
        return result;
    }

    public void bookFlight(String passengerName, Flight flight) {
        bookings.add(new Booking(passengerName, flight));
        System.out.println("Booking successful for " + passengerName);
    }

    public void viewBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings yet.");
            return;
        }
        for (Booking booking : bookings) {
            System.out.println(booking);
        }
    }
}

