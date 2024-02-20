public class Main {

    public static void main(String[] args) {
        System.out.println("【switch文】");
        System.out.printf("A → %s\n", japaneseRank("A"));
        System.out.printf("B → %s\n", japaneseRank("B"));
        System.out.printf("C → %s\n", japaneseRank("C"));
        System.out.printf("D → %s\n", japaneseRank("D"));
        System.out.printf("F → %s\n", japaneseRank("F"));
        System.out.printf("それ以外 → %s\n", japaneseRank("それ以外"));
    }

    private static String japaneseRank(String rank) {
        // 穴埋め
        switch (rank) {
            case "A":
                return "秀";
            case "B":
                return "優";
            case "C":
                return "良";
            case "D":
                return "可";
            case "F":
                return "不可";
            default:
                return "不正な文字列です";
        }
    }

}