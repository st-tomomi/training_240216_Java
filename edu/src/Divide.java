public class Divide implements Calculator {
    private int value;

    @Override
    public int getValue() {
        return this.value;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int calc(int operand) {
        if (this.value == 0) {
            throw new ArithmeticException("0で割ることはできません");
        }
        return operand / this.value;
    }
}
