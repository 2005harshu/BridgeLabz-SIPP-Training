import java.util.Scanner;

public class NumberCollector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10]; 
        double total = 0.0;
        int index = 0;

        System.out.println("Enter up to 10 positive numbers (enter 0 or negative to stop):");

        while (true) {
            System.out.print("Enter number " + (index + 1) + ": ");
            double num = sc.nextDouble();

            if (num <= 0) {
                break; 
            }

            numbers[index] = num;
            index++;

            if (index == 10) {
                break; // Stop if array is full
            }
        }

        System.out.println("\nYou entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        System.out.println("Total sum = " + total);

    }
}
