/*
Pattern 05 - Rotated Half Pyramid

Output:
   *
  **
 ***
****
*/

public class RotatedHalfPyramid {

    public static void main(String[] args) {

        int rows = 4;

        for (int i = 1; i <= rows; i++) {

            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}