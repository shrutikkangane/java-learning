public class ArrayDeclaration {

    public static void main(String[] args) {

        int[] marks = new int[3];

        marks[0] = 67;
        marks[1] = 68;
        marks[2] = 69;

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
