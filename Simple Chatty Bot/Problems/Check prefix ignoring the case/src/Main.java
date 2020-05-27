import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        text = text.toUpperCase();
        boolean flag = text.startsWith("J");

        System.out.println(flag);
    }
}