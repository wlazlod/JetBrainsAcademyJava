import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int max = 0;

        for(int i=0; i<number; i++){
            int n = scanner.nextInt();
            if(n>max && n%4==0) max = n;
        }

        System.out.println(max);
    }
}