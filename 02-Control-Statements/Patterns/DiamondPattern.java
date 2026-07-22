
/*
Pattern 14 - Diamond Pattern

Output:

   *
  ***
 *****
*******
 *****
  ***
   *

*/

public class DiamondPattern {

    public static void main(String[] args) {

        int rows = 4;

        // Upper Half
        for (int i = 1; i <= rows; i++) {

            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            int stars = 2 * i - 1;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Half
        for (int i = rows - 1; i >= 1; i--) {

            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            int stars = 2 * i - 1;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}