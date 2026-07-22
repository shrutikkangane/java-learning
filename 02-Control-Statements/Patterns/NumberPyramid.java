/*
Pattern 12 - Number Pyramid

Output:

    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5

*/

public class NumberPyramid {

    public static void main(String[] args) {

        int rows = 5;

        for (int i = 1; i <= rows; i++) {

            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }
}
