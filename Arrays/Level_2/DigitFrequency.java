import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input number
        System.out.print("Enter a number: ");
        long number = sc.nextLong(); // long to support big numbers

        // Step 2: Convert to positive if needed
        number = Math.abs(number);

        // Step 3: Frequency array of size 10
        int[] frequency = new int[10];

        // Step 4: Count frequency of each digit
        while (number != 0) {
            int digit = (int)(number % 10);
            frequency[digit]++;
            number /= 10;
        }

        // Step 5: Display frequency
        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " time(s)");
            }
        }
    }
}
