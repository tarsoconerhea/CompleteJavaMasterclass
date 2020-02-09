package Lesson3VariablesDatatypesAndOperators.Ex6GettingToKnowPrimitiveDataTypes;

public class Main {
    public static void main(String[] args) {
        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDobleValue = 5d / 3d;
        System.out.println("myIntValue - " + myIntValue);
        System.out.println("myFloatValue - " + myFloatValue);
        System.out.println("myDobleValue - " + myDobleValue);

        /*---------------------------------------------------*/
        double numPounds = 200d;
        double convertedKilograms = numPounds * 0.45359237d;
        System.out.println("Kilograms - " + convertedKilograms);
    }
}
