import java.util.Scanner;

public class LargestOfTwo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = sc.nextInt();

        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        if (first > second) {
            System.out.println(first + " is Greater.");
        } else if (second > first) {
            System.out.println(second + " is Greater.");
        } else {
            System.out.println("Both numbers are Equal.");
        }

        sc.close();
    }
}