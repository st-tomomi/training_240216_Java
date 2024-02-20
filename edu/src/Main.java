import java.util.ArrayList;
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

    public static void main(String[] args) {
        System.out.println("追加前:");
        CONST_LIST.stream().forEach(e -> System.out.println(e));
        CONST_LIST.add("4番目");
        System.out.println("追加後:");
        CONST_LIST.stream().forEach(e -> System.out.println(e));
    }
}
