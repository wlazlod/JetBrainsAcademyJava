import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = 0;
        int num;

        do{
            num = scanner.nextInt();
            if(num != 0) len++;
        } while (num != 0);

        System.out.println(len);


    }
}