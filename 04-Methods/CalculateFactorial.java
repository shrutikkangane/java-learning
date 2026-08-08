import java.util.Scanner;

public class CalculateFactorial {

    public static int calculateFactorial(int n) {

        if (n < 0) {
            System.out.println("Invalid Number");
            return -1;
        }

        int factorial = 1;

        for (int i = n; i >= 1; i--) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int factorial = calculateFactorial(n);

        if (factorial != -1) {
            System.out.println("Factorial: " + factorial);
        }

        sc.close();
    }
}
