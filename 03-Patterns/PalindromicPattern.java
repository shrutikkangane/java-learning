/*
Pattern 13 - Palindromic Pattern

Output:

    1
   212
  32123
 4321234
543212345

*/

public class PalindromicPattern {

    public static void main(String[] args) {

        int rows = 5;

        for (int i = 1; i <= rows; i++) {

            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print descending numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Print ascending numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
