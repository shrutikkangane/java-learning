/*
Pattern 10 - Butterfly Pattern

Output:

*      *
**    **
***  ***
********
********
***  ***
**    **
*      *

*/

public class ButterflyPattern {

    public static void main(String[] args) {

        int rows = 4;

        // Upper Half
        for (int i = 1; i <= rows; i++) {

            // Left Wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Middle Spaces
            int spaces = 2 * (rows - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Right Wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Half
        for (int i = rows; i >= 1; i--) {

            // Left Wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Middle Spaces
            int spaces = 2 * (rows - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Right Wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}