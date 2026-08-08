public class InsertCharacter {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Jon");

        sb.insert(2, 'i');

        System.out.println("After insertion: " + sb);
    }
}
