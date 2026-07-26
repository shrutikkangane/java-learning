import java.util.Scanner;

public class ReplaceCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String originalString = sc.next();

        String result = "";

        // Replace 'e' with 'i'
        for (int i = 0; i < originalString.length(); i++) {

            if (originalString.charAt(i) == 'e') {
                result += 'i';
            } else {
                result += originalString.charAt(i);
            }
        }

        System.out.println("Modified String: " + result);

        sc.close();
    }
}
