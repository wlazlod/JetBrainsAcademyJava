import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int barrier = 1000;
        int n;

        do{
            n = scanner.nextInt();
            sum += n;
            if(n==0) break;
            if(sum>=barrier){
                sum = sum - barrier;
                break;
            }
        }
        while (n!=0);

        System.out.println(sum);

    }
}