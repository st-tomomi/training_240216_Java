public class Main {

    public static void main(String[] args) {

        A a1 = new A();
        A a2 = new A();
        System.out.printf("a1.CONST_STRING1 == a2.CONST_STRING1 : %b\n",
                a1.CONST_STRING1 == a2.CONST_STRING1);
        System.out.printf("a1.CONST_STRING2 == a2.CONST_STRING2 : %b\n",
                a1.CONST_STRING2 == a2.CONST_STRING2);

        // A a = new A(1);
        // System.out.println("a初期化");
        // System.out.printf("a.getValue() = %d\n", a.getValue());
        // System.out.printf("a.getStaticValue() = %d\n", a.getStaticValue());
        // A b = new A(3);
        // System.out.println("b初期化");
        // System.out.printf("a.getValue() = %d\n", a.getValue());
        // System.out.printf("a.getStaticValue() = %d\n", a.getStaticValue());
        // System.out.printf("b.getValue() = %d\n", b.getValue());
        // System.out.printf("b.getStaticValue() = %d\n", b.getStaticValue());
        // a.setValue(2);
        // System.out.println("a.setValue(2)");
        // a.setStaticValue(4);
        // System.out.println("a.setStaticValue(4)");
        // System.out.printf("a.getValue() = %d\n", a.getValue());
        // System.out.printf("a.getStaticValue() = %d\n", a.getStaticValue());
        // System.out.printf("b.getValue() = %d\n", b.getValue());
        // System.out.printf("b.getStaticValue() = %d\n", b.getStaticValue());
    }

}