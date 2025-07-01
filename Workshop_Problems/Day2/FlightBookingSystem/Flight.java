package Day2.FlightBookingSystem;

public class Flight {
    String flightNumber;
    String source;
    String destination;

    public Flight(String flightNumber, String source, String destination) {
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Flight " + flightNumber + " from " + source + " to " + destination;
    }
}
