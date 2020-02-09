package Lesson4JavaTutorialExpressionsStatementsCodeBlocksMethodsAndMore.Ex6MethodsInJava;

public class Main {
    public static void main(String[] args) {

        calculatedStore(true, 800, 5, 100);

        calculatedStore(true, 10000, 8, 200);

        calculatedStore(false, 500, 9, 56);

    }

    private static int calculatedStore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;

    }
}
