package Day2.CinemaBooking;

import java.util.ArrayList;
import java.util.List;

public class MovieScheduleManager {
    private List<String> titles;
    private List<String> showtimes;

    public MovieScheduleManager() {
        titles = new ArrayList<>();
        showtimes = new ArrayList<>();
    }

    public void addMovie(String title, String time) throws InvalidTimeFormatException {
        if (!isValidTimeFormat(time)) {
            throw new InvalidTimeFormatException("Invalid time format: " + time);
        }
        titles.add(title);
        showtimes.add(time);
        System.out.println("Movie added: " + title + " at " + time);
    }

    public void searchMovie(String keyword) {
        boolean found = false;
        System.out.println("\nSearch results for: \"" + keyword + "\"");
        for (int i = 0; i < titles.size(); i++) {
            if (titles.get(i).toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(String.format("%d. %s - %s", i + 1, titles.get(i), showtimes.get(i)));
                found = true;
            }
        }
        if (!found) {
            System.out.println("No movies found with keyword: " + keyword);
        }
    }

    public void displayAllMovies() {
        if (titles.isEmpty()) {
            System.out.println("No movies scheduled.");
            return;
        }

        System.out.println("\n--- All Movies ---");
        for (int i = 0; i < titles.size(); i++) {
            System.out.println(String.format("%d. %s - %s", i + 1, titles.get(i), showtimes.get(i)));
        }
    }

    public void generateReport() {
        System.out.println("\n--- Movie Report (Array Format) ---");
        String[] titleArray = titles.toArray(new String[0]);
        String[] timeArray = showtimes.toArray(new String[0]);

        for (int i = 0; i < titleArray.length; i++) {
            System.out.println((i + 1) + ". " + titleArray[i] + " at " + timeArray[i]);
        }
    }

    private boolean isValidTimeFormat(String time) {
        // Valid format HH:mm (e.g. 23:59), using 24-hour time
        if (!time.matches("\\d{2}:\\d{2}")) return false;
        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);
        return hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59;
    }
}

