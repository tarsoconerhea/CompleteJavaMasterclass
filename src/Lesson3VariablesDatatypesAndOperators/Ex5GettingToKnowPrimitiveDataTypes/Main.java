package Lesson3VariablesDatatypesAndOperators.Ex5GettingToKnowPrimitiveDataTypes;

public class Main {
    public static void main(String[] args) {
        int myValue = 1_000_000_000;

        byte myByteValue = 127;

        short myShortValue = 32767;
        System.out.println(myShortValue);

        long myLongValue = 9_999_999_999_999L;
        System.out.println(myLongValue);

        int myTotal = (myValue / 2);
        byte myNewByteValue = (byte) (myByteValue / 2);
        System.out.println(myTotal + myNewByteValue);

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;
        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
        System.out.println("longTotal = " + longTotal);
        System.out.println("shortTotal = " + shortTotal);
    }
}
