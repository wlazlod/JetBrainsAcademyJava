import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        number++;
        int nextEven = number + number%2;

        System.out.println(nextEven);
    }
}