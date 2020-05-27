import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        boolean result = ((first >= second) && (first <= third) || (first >= third) && (first <= second) );
        System.out.println(result);
    }
}