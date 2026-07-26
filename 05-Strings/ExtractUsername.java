import java.util.Scanner;

public class ExtractUsername {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String email = sc.next();

        String userName = "";

        // Extract username
        for (int i = 0; i < email.length(); i++) {

            if (email.charAt(i) == '@') {
                break;
            }

            userName += email.charAt(i);
        }

        System.out.println("Username: " + userName);

        sc.close();
    }
}