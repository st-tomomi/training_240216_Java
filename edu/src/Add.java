public class Add implements Calculator {
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
        return operand + this.value;
    }

}
