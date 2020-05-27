import java.util.Scanner;

public class Main {

    public static boolean isComposite(long number) {
        if (number == 1){
            return false;
        }
        int divisors = 0;
        for (long i = number; i>=1; i--){
            if(number % i == 0) divisors++;
        }
        if(divisors > 2) return true;
        else return false;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
    }
}