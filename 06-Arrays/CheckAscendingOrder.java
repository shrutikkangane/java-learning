import java.util.Scanner;

public class CheckAscendingOrder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter array elements:");

        // Input
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        boolean isAscending = true;

        // Check if array is sorted
        for (int i = 0; i < numbers.length - 1; i++) {

            if (numbers[i] > numbers[i + 1]) {
                isAscending = false;
                break;
            }
        }

        if (isAscending) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is not sorted in ascending order.");
        }

        sc.close();
    }
}
