public class Main {

    public static void main(String[] args) {
        // int intA = 1;
        // int intB = 1;
        // System.out.printf("intA == intB : %b\n", intA == intB);
        // Integer integerA = new Integer(1);
        // Integer integerB = new Integer(1);
        // System.out.printf("integerA == integerB : %b\n", integerA == integerB);
        // String stringA = new String("1");
        // String stringB = new String("1");
        // System.out.printf("stringA == stringB : %b\n", stringA == stringB);

        // System.out.printf("integerA.equals(integerB) : %b \n",
        // integerA.equals(integerB));
        // System.out.printf("stringA.equals(stringB) : %b \n",
        // stringA.equals(stringB));

        Integer integerA = Integer.valueOf(1);
        Integer integerB = Integer.valueOf(1);
        System.out.printf("integerA == integerB : %b\n", integerA == integerB);
        String stringA = "1";
        String stringB = "1";
        System.out.printf("stringA == stringB : %b\n", stringA == stringB);

    }

}