package Lesson4JavaTutorialExpressionsStatementsCodeBlocksMethodsAndMore.Ex12CodingExercises;

public class Main {
    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(-5);
        checkNumber(0);

    }
    public static void checkNumber(int number){
        if (number > 0){
            System.out.println("positive");
        } else if (number < 0){
            System.out.println("negative");
        } else if (number ==0){
            System.out.println("ZERO");
        }
    }


}
