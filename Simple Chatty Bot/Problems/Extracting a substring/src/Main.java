import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int start = scanner.nextInt();
        int finish = scanner.nextInt();

        String subText = text.substring(start, ++finish);
        System.out.println(subText);
    }
}