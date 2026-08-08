import java.util.Scanner;

public class StringInput {

    public static void main(String[] args) {

        // String Declaration
        String name = "Jon";
        String fullName = "Jon Snow";
        String sentence = "This is Jon Snow. He is the King in the North.";

        // Display declared strings
        System.out.println("Name: " + name);
        System.out.println("Full Name: " + fullName);
        System.out.println("Sentence: " + sentence);

        Scanner sc = new Scanner(System.in);

        // Single-word input
        System.out.print("\nEnter your first name: ");
        String firstName = sc.next();

        // Consume the leftover newline
        sc.nextLine();

        // Multi-word input
        System.out.print("Enter your full name: ");
        String userFullName = sc.nextLine();

        System.out.println("\nFirst Name: " + firstName);
        System.out.println("Full Name: " + userFullName);

        sc.close();
    }
}