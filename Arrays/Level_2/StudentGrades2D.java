import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3]; // [students][subjects]
        double[] percentage = new double[n];
        String[] grade = new String[n];

        // Step 2: Input marks
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            System.out.print("Physics: ");
            int p = sc.nextInt();
            System.out.print("Chemistry: ");
            int c = sc.nextInt();
            System.out.print("Maths: ");
            int m = sc.nextInt();

            if (p < 0 || c < 0 || m < 0) {
                System.out.println("Marks cannot be negative. Please re-enter.");
                i--; // retry this student
                continue;
            }

            marks[i][0] = p;
            marks[i][1] = c;
            marks[i][2] = m;

            int total = p + c + m;
            percentage[i] = total / 3.0;

            // Assign grade
            if (percentage[i] >= 90)
                grade[i] = "A+";
            else if (percentage[i] >= 80)
                grade[i] = "A";
            else if (percentage[i] >= 70)
                grade[i] = "B";
            else if (percentage[i] >= 60)
                grade[i] = "C";
            else if (percentage[i] >= 50)
                grade[i] = "D";
            else
                grade[i] = "F";
        }

        // Step 3: Display Results
        System.out.println("\n--- Student Report ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d -> Physics: %d, Chemistry: %d, Maths: %d, Percentage: %.2f%%, Grade: %s\n",
                    i + 1,
                    marks[i][0], marks[i][1], marks[i][2],
                    percentage[i], grade[i]);
        }

    }
}
