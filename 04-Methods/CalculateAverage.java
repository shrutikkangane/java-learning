import java.util.Scanner;

public class CalculateAverage {

    public static double calculateAverage(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        double average = calculateAverage(a, b, c);

        System.out.println("Average of three numbers: " + average);

        sc.close();
    }
}