package Day2.FlightBookingSystem;

public class Booking {
    String passengerName;
    Flight flight;

    public Booking(String passengerName, Flight flight) {
        this.passengerName = passengerName;
        this.flight = flight;
    }

    @Override
    public String toString() {
        return "Passenger: " + passengerName + ", " + flight.toString();
    }
}

