public class Main {
    public static void main(String[] args) {
        String text = "emojiは日本発祥の文化です😄";
        int length = text.codePointCount(0, text.length());
        System.out.printf("文字数 = %d\n", length);

        for (int i = 0; i < length; i++) {
            int index = text.offsetByCodePoints(0, i);
            int c = text.codePointAt(index);
            System.out.printf("%d文字目: %c\n", i, c);
        }
    }
}
