public class Main {
    public static void main(String... args) throws Exception {
        String text = "A";
        int number = 1;

        // 穴埋め部
        String displayText = String.format("text = \"%s\", number = %d", text, number);
        System.out.println(displayText);
    }
}
