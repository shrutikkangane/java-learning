public class CharacterAt {

    public static void main(String[] args) {

        String fullName = "Jon Snow";

        System.out.println("Characters in the string:");

        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
    }
}
