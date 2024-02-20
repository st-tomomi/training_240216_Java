public class Main {
    public static void main(String... args) throws Exception {
        String text = "A";
        int number = 1;

        // 穴埋め部
        StringBuilder sb = new StringBuilder();
        sb.append("text = \"").append(text).append("\", number = ").append(number);
        String displayText = sb.toString();
        System.out.println(displayText);
    }
}
