import java.util.Scanner;

public class GreetingIfElse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a Greeting");
        System.out.println("1. Hello");
        System.out.println("2. Namaste");
        System.out.println("3. Bonjour");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Hello");
        } else if (choice == 2) {
            System.out.println("Namaste");
        } else if (choice == 3) {
            System.out.println("Bonjour");
        } else {
            System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}