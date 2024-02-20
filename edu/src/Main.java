import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println("【switch文】");
        System.out.printf("A → %s\n", japaneseRank("A"));
        System.out.printf("B → %s\n", japaneseRank("B"));
        System.out.printf("C → %s\n", japaneseRank("C"));
        System.out.printf("D → %s\n", japaneseRank("D"));
        System.out.printf("F → %s\n", japaneseRank("F"));
        System.out.printf("それ以外 → %s\n", japaneseRank("それ以外"));

        System.out.println("【Map#get】");
        System.out.printf("A → %s\n", japaneseRankMap("A"));
        System.out.printf("B → %s\n", japaneseRankMap("B"));
        System.out.printf("C → %s\n", japaneseRankMap("C"));
        System.out.printf("D → %s\n", japaneseRankMap("D"));
        System.out.printf("F → %s\n", japaneseRankMap("F"));
        System.out.printf("それ以外 → %s\n", japaneseRankMap("それ以外"));

        System.out.println("【Enum.valueOf】");
        System.out.printf("A → %s\n", japaneseRankEnum("A"));
        System.out.printf("B → %s\n", japaneseRankEnum("B"));
        System.out.printf("C → %s\n", japaneseRankEnum("C"));
        System.out.printf("D → %s\n", japaneseRankEnum("D"));
        System.out.printf("F → %s\n", japaneseRankEnum("F"));
        System.out.printf("それ以外 → %s\n", japaneseRankEnum("それ以外"));
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

    private static String japaneseRankMap(String rank) {
        // 穴埋め
        Map<String, String> map = new HashMap<>();
        map.put("A", "秀");
        map.put("B", "優");
        map.put("C", "良");
        map.put("D", "可");
        map.put("F", "不可");
        return map.getOrDefault(rank, "不正な文字列です");
    }

    private static String japaneseRankEnum(String rank) {
        // 穴埋め
        try {
            return Rank.valueOf(rank).getJapanese();
        } catch (IllegalArgumentException e) {
            return "不正な文字列です";
        }
    }

}