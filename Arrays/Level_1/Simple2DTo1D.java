import java.util.Scanner;

public class Simple2DTo1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        int[] array = new int[rows * cols];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element: ");
                matrix[i][j] = sc.nextInt();
                array[index++] = matrix[i][j];
            }
        }

        System.out.println("1D Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
