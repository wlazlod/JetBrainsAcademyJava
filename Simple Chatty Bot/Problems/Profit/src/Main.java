import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = scanner.nextInt();
        int P = scanner.nextInt();
        int K = scanner.nextInt();

        double deposit = M;
        int year = 0;

        while (deposit<K) {
            deposit = deposit + deposit*P/100;
            //System.out.println(deposit);
            year++;
        }

        System.out.println(year);

    }
}