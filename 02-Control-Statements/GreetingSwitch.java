import java.util.Scanner;

public class GreetingSwitch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a Greeting");
        System.out.println("1. Hello");
        System.out.println("2. Namaste");
        System.out.println("3. Bonjour");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Hello");
                break;

            case 2:
                System.out.println("Namaste");
                break;

            case 3:
                System.out.println("Bonjour");
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}