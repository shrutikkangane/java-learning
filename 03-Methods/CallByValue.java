public class CallByValue {

    public static void changeValue(int x) {
        x = 100;
    }

    public static void main(String[] args) {

        int a = 10;

        changeValue(a);

        System.out.println(a);

    }
}
