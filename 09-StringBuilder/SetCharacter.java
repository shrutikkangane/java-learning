public class SetCharacter {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Jon");

        sb.setCharAt(0, 'D');

        System.out.println("Updated String: " + sb);
    }
}
