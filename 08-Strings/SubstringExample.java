public class SubstringExample {

    public static void main(String[] args) {

        String sentence = "My name is Jon";

        String name = sentence.substring(11, sentence.length());

        System.out.println("Original String: " + sentence);
        System.out.println("Extracted Substring: " + name);
    }
}