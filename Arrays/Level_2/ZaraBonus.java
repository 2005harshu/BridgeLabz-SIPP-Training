import java.util.Scanner;

public class ZaraBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        double[] service = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            System.out.print("Salary: ");
            double s = sc.nextDouble();

            System.out.print("Years of Service: ");
            double y = sc.nextDouble();

            if (s <= 0 || y < 0) {
                System.out.println("Invalid input! Try again.");
                i--; // retry current employee
                continue;
            }

            salary[i] = s;
            service[i] = y;
        }

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            if (service[i] > 5)
                bonus[i] = salary[i] * 0.05;
            else
                bonus[i] = salary[i] * 0.02;

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\n--- Employee Salary Details ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) +
                " | Old: " + salary[i] +
                " | Bonus: " + bonus[i] +
                " | New: " + newSalary[i]);
        }
        System.out.println("\nTotal Bonus Paid: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

    }
}
