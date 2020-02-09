import java.util.Scanner; // importing scanner from the standard library

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int digit = (num1 / 10);
        System.out.println(digit);
    }
}