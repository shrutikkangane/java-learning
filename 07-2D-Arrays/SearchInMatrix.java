import java.util.Scanner;

public class SearchInMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        System.out.println("Enter matrix elements:");

        // Input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter element to search: ");
        int x = sc.nextInt();

        boolean found = false;

        // Search
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (numbers[i][j] == x) {
                    System.out.println("Element found at position (" + i + ", " + j + ")");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Element not found.");
        }

        sc.close();
    }
}
