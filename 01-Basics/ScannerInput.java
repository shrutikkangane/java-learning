import java.util.*;

public class ScannerInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your percentage: ");
        float percentage = sc.nextFloat();

        System.out.println("\n----- Student Details -----");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Percentage : " + percentage);

        sc.close();
    }
}