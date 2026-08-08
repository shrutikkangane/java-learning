import java.util.Scanner;

public class Functions {

    // Method to print the given name
    public static void printMyName(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        printMyName(name);

        sc.close();
    }
}