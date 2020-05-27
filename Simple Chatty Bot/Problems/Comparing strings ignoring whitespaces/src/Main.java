import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text1 = scanner.nextLine();
        String text2 = scanner.nextLine();

        String text1Trimmed = text1.replaceAll("\\s+","");
        String text2Trimmed = text2.replaceAll("\\s+","");

        boolean flag = text1Trimmed.equals(text2Trimmed);
        System.out.println(flag);
    }
}