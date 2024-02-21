public class Main {
    public static void main(String[] args) throws Exception {
        StringBuilder text = new StringBuilder("a");
        changeText(text);

        System.out.println(text.toString());
    }

    private static void changeText(StringBuilder text) {
        text.append("b");
    }
}
