public class Main {

    public static void main(String[] args) {
        Parent a = new Child(1);
        System.out.printf("a.value = %d\n", a.value);
        System.out.printf("a.getValue() = %d\n", a.getValue());
        System.out.printf("a.getValueString() = \"%s\"\n", a.getValueString());
        System.out.printf("a.getValueString2() = \"%s\"\n", a.getValueString2());
        System.out.printf(a.getValueString2());
    }
}