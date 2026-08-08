import java.util.Scanner;

public class CumulativeStringLength {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int size = sc.nextInt();

        String[] words = new String[size];

        int totalLength = 0;

        System.out.println("Enter the strings:");

        // Input
        for (int i = 0; i < size; i++) {
            words[i] = sc.next();
            totalLength += words[i].length();
        }

        System.out.println("Total length of all strings: " + totalLength);

        sc.close();
    }
}