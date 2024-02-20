import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Calculator> stack = new ArrayList<>();
        Calculator add5 = new Add();
        add5.setValue(5);
        stack.add(add5);
        Calculator multiply5 = new Multiply();
        multiply5.setValue(5);
        stack.add(multiply5);
        System.out.printf("(3 + 5) × 5 = %d\n", calcAll(3, stack));
    }

    // stackの計算を左から順に全て実行する
    private static int calcAll(int i, List<Calculator> stack) {
        // 穴埋め部
        int operand = i;
        for (Calculator calculator : stack) {
            operand = calculator.calc(operand);
        }
        return operand;
    }

}