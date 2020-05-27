import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int butterCups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        boolean success;

        if(isWeekend) success = butterCups >= 15 && butterCups <=25;
        else success = butterCups >= 10 && butterCups <=20;

        System.out.println(success);
    }
}