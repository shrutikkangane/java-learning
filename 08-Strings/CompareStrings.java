public class CompareStrings {

    public static void main(String[] args) {

        String name1 = "Jon";
        String name2 = "Snow";

        int result = name1.compareTo(name2);

        if (result == 0) {
            System.out.println("Strings are equal.");
        } else if (result < 0) {
            System.out.println("\"" + name1 + "\" comes before \"" + name2 + "\".");
        } else {
            System.out.println("\"" + name1 + "\" comes after \"" + name2 + "\".");
        }
    }
}
