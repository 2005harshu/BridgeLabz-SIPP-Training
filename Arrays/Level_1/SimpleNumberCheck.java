import java.util.Scanner;

public class SimpleNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            int num = numbers[i];
            if (num > 0) {
                if (num % 2 == 0)
                    System.out.println(num + " is positive even");
                else
                    System.out.println(num + " is positive odd");
            } else if (num < 0) {
                System.out.println(num + " is negative");
            } else {
                System.out.println("Number is zero");
            }
        }

        if (numbers[0] == numbers[4])
            System.out.println("First and last elements are equal");
        else if (numbers[0] > numbers[4])
            System.out.println("First element is greater than last");
        else
            System.out.println("First element is less than last");

    }
}
