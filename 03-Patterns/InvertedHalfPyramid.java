
/*
Pattern 04 - Inverted Half Pyramid

Output:
****
***
**
*
*/

public class InvertedHalfPyramid {

    public static void main(String[] args) {

        int rows = 4;

        for (int i = rows; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}