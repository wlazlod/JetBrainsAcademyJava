import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int digit1 = (number / 100);
        int digit2 = (number % 100) / 10;
        int digit3 = number % 10;
        int newNumber = digit3 * 100 + digit2 * 10 + digit1;
        System.out.println(newNumber);
    }
}