import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user to enter a date
        System.out.print("Enter date (yyyy-mm-dd): ");
        String input = sc.nextLine();

        // Convert to LocalDate
        LocalDate date = LocalDate.parse(input);

        // Add 7 days, 1 month, and 2 years
        LocalDate addedDate = date.plusDays(7).plusMonths(1).plusYears(2);

        // Subtract 3 weeks (21 days)
        LocalDate finalDate = addedDate.minusWeeks(3);

        // Show the final result
        System.out.println("Final Date: " + finalDate);
    }
}
