import java.util.Scanner;

public class NameArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int size = sc.nextInt();

        String[] names = new String[size];

        System.out.println("Enter the names:");

        // Input
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.next();
        }

        System.out.println("\nNames entered:");

        // Output
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name " + (i + 1) + ": " + names[i]);
        }

        sc.close();
    }
}
