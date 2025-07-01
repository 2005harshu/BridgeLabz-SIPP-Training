package Day2.CinemaBooking;

import java.util.Scanner;

public class CinemaTimeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovieScheduleManager manager = new MovieScheduleManager();

        while (true) {
            System.out.println("\n--- CinemaTime: Movie Schedule Manager ---");
            System.out.println("1. Add Movie");
            System.out.println("2. Search Movie");
            System.out.println("3. Display All Movies");
            System.out.println("4. Generate Printable Report");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter movie title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter showtime (HH:mm): ");
                    String time = scanner.nextLine();
                    try {
                        manager.addMovie(title, time);
                    } catch (InvalidTimeFormatException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    System.out.print("Enter search keyword: ");
                    String keyword = scanner.nextLine();
                    try {
                        manager.searchMovie(keyword);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Invalid search index.");
                    }
                    break;

                case 3:
                    manager.displayAllMovies();
                    break;

                case 4:
                    manager.generateReport();
                    break;

                case 5:
                    System.out.println("Exiting CinemaTime. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}

