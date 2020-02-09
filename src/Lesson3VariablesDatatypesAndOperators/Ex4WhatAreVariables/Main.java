package Lesson3VariablesDatatypesAndOperators.Ex4WhatAreVariables;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Tim");
        int myFirstNumber = (10 + 5) + (2 * 10) + (50 - 10);
        int mySecondNumber = 6;
        int myThirdNumber = mySecondNumber * 3;

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        int myLastNumber = 1000 - myTotal;
        System.out.println(myLastNumber);
    }
}
