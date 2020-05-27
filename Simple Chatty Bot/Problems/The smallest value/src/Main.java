import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long max = scanner.nextLong();
        int i = 1;
        long factorial = 1;

        while(factorial<=max){
            i++;
            factorial*=i;
        }

        System.out.println(i);

    }
}
