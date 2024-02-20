import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1番目");
        list.add("2番目");
        list.add("3番目");

        // 穴埋め部
        // for文
        System.out.print("【for文】\n");
        String doublequotation = "\"";
        for (int i = 0; i < list.size(); i++) {
            System.out.print(doublequotation + list.get(i) + doublequotation);
            System.out.println();
        }

        // 拡張for文
        System.out.print("\n【拡張for文】\n");
        for (String item : list) {
            System.out.print(doublequotation + item + doublequotation);
            System.out.println();
        }

        // Stream#forEach
        System.out.print("\n【Stream#forEach】\n");
        list.stream().forEach(item -> System.out.println(doublequotation + item + doublequotation));
    }
}
