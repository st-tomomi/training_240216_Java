public class Parent {
    public int value;

    public Parent(int value) {
        this.value = value;
    }

    // ChildでOverrideされている
    public int getValue() {
        return value;
    }

    public String getValueString() {
        return Integer.toString(value);
    }

    public String getValueString2() {
        return Integer.toString(getValue());
    }
}
