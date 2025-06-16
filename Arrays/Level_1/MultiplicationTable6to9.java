import java.util.Scanner;

public class MultiplicationTable6to9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        
        int[] multiplicationResult = new int[4];

        for (int i = 0; i < multiplicationResult.length; i++) {
            int multiplier = i + 6; // from 6 to 9
            multiplicationResult[i] = number * multiplier;
        }

        System.out.println("\nMultiplication Table of " + number + " from 6 to 9:");
        for (int i = 0; i < multiplicationResult.length; i++) {
            int multiplier = i + 6;
            System.out.println(number + " * " + multiplier + " = " + multiplicationResult[i]);
        }
    }
}
