package Lesson3VariablesDatatypesAndOperators.Ex8UnderstandingStringAndFinishingUpPrimitiveDataTypes;

public class Main {
    public static void main(String[] args) {
        String myString = "This is a String";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2015";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.55";
        System.out.println("The result is " + numberString);

        String lastString = "100";
        int myInt = 1056;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("LastString value " + lastString);

    }
}
