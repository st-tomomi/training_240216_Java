import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println("【if文】");
        judgementTest("10", 24);
        judgementTest("20", 24);
        judgementTest("30", 24);
        judgementTest("40", 24);
        judgementTest("50", 24);
        judgementTest("24", 24);
        judgementTest("50", 25);
        judgementTest("25", 25);
        System.out.println();
        System.out.println("【Set#contains】");
        judgementTestSetcontains("10", 24);
        judgementTestSetcontains("20", 24);
        judgementTestSetcontains("30", 24);
        judgementTestSetcontains("40", 24);
        judgementTestSetcontains("50", 24);
        judgementTestSetcontains("24", 24);
        judgementTestSetcontains("50", 25);
        judgementTestSetcontains("25", 25);
    }

    private static void judgementTest(String code, int value) {
        System.out.printf("(code = \"%s\", value = %d) → %b\n", code, value, judgement(code, value));
    }

    private static void judgementTestSetcontains(String code, int value) {
        System.out.printf("(code = \"%s\", value = %d) → %b\n", code, value, judgementSetcontains(code, value));
    }

    private static boolean judgement(String code, int value) {
        // 穴埋め
        if (code.equals("10") || code.equals("30") || code.equals("40")) {
            return true;
        }
        if (value < 25 && code.equals("50")) {
            return true;
        }
        if (value >= 25 && code.equals(String.valueOf(value))) {
            return true;
        }
        return false;
    }

    private static boolean judgementSetcontains(String code, int value) {
        // 穴埋め
        Set<String> codes = Set.of("10", "30", "40");
        return codes.contains(code) ||
                (value < 25 && "50".equals(code)) ||
                (value >= 25 && code.equals(String.valueOf(value)));
    }
}
