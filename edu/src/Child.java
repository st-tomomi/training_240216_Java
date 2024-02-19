public class Child extends Parent {
    private int childValue;

    Child(int value) {
        super(value);
        this.childValue = value * 2;
    }

    @Override
    public int getValue() {
        return childValue * 2;
    }
}
