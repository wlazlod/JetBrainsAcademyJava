import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int d1 = number/1000;
        int d2 = (number/100)%10;
        int d3 = (number/10)%10;
        int d4 = number%10;

        if(d1==d4 && d2==d3) System.out.println(1);
        else System.out.println(37);
    }
}