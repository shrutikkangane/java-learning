public class Operators {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("----- Arithmetic Operators -----");
        System.out.println("Addition       : " + (a + b));
        System.out.println("Subtraction    : " + (a - b));
        System.out.println("Multiplication : " + (a * b));
        System.out.println("Division       : " + (a / b));
        System.out.println("Modulus        : " + (a % b));

        // Relational Operators
        System.out.println("\n----- Relational Operators -----");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // Logical Operators
        boolean x = true;
        boolean y = false;

        System.out.println("\n----- Logical Operators -----");
        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x     : " + (!x));

        // Assignment Operators
        int num = 20;

        System.out.println("\n----- Assignment Operators -----");
        System.out.println("Initial Value : " + num);

        num += 5;
        System.out.println("After += 5 : " + num);

        num -= 3;
        System.out.println("After -= 3 : " + num);

        // Unary Operators
        int count = 10;

        System.out.println("\n----- Unary Operators -----");
        System.out.println("Initial Value : " + count);
        System.out.println("Post Increment : " + (count++));
        System.out.println("Current Value  : " + count);
        System.out.println("Pre Increment  : " + (++count));
    }
}
