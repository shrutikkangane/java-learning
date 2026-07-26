public class DeleteCharacter {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Join");

        sb.delete(2, 3);

        System.out.println("After deletion: " + sb);
    }
}
