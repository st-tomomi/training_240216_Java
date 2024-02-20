import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    private static final List<String> CONST_LIST;
    static {
        // 穴埋め部
        CONST_LIST = new ArrayList<>();
        CONST_LIST.add("1番目");
        CONST_LIST.add("2番目");
        CONST_LIST.add("3番目");
    }

    // 問2
    private static final List<String> list = new ArrayList<>();
    static {
        list.add("1番目");
        list.add("2番目");
        list.add("3番目");
    }
    public static final List<String> CONST_LIST2 = Collections.unmodifiableList(list);

    public static void main(String[] args) {
        System.out.println("【問1】");
        System.out.println("追加前:");
        CONST_LIST.stream().forEach(e -> System.out.println(e));
        CONST_LIST.add("4番目");
        System.out.println("追加後:");
        CONST_LIST.stream().forEach(e -> System.out.println(e));

        System.out.println();
        System.out.println("【問2】");
        System.out.println("追加前:");
        CONST_LIST2.stream().forEach(e -> System.out.println(e));
        System.out.println();
        try {
            // 4番目を追加
            CONST_LIST2.add("4番目");
        } catch (UnsupportedOperationException e) {
            System.out.println("unmodifiableList変換したリストに要素を追加しようとしています。");
            System.out.println();
        }
        System.out.println("追加後:");
        CONST_LIST2.stream().forEach(e -> System.out.println(e));
    }
}
