import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
// calculating factorial using for loop
        if (n >= 0) {
            long fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }

            System.out.println("Factorial of " + n + " is " + fact);
        } else {
            System.out.println("Factorial not defined for negative numbers.");
        }
    }
}

