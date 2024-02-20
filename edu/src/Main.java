import java.util.*;

public class Main {
    public static void main(String... args) throws Exception {
        List<Long> results = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            long start = System.nanoTime();

            // 穴埋め部
            StringBuilder a = new StringBuilder();
            for (int j = 0; j < 100000; j++) {
                a.append("B");
            }
            a.toString();

            long end = System.nanoTime();
            long result = end - start;
            System.out.printf("実行時間(%d回目): %dナノ秒\n", i + 1, result);
            results.add(result);
        }

        System.out.printf("実行時間(平均): %.0fナノ秒", results.stream().mapToLong(e -> e).average().orElse(Double.NaN));
    }
}
