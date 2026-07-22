import java.util.Scanner;

public class PassFail {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        if (marks >= 35) {
            System.out.println("Result : Pass");
        } else {
            System.out.println("Result : Fail");
        }

        sc.close();
    }
}