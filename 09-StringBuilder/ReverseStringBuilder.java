public class ReverseStringBuilder {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("hello");

        System.out.println("Original String: " + sb);

        for (int i = 0; i < sb.length() / 2; i++) {

            int left = i;
            int right = sb.length() - 1 - i;

            char leftChar = sb.charAt(left);
            char rightChar = sb.charAt(right);

            sb.setCharAt(left, rightChar);
            sb.setCharAt(right, leftChar);
        }

        System.out.println("Reversed String: " + sb);
    }
}