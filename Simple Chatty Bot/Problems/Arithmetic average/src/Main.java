import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        float sum = 0;
        int number = 0;

        for(int i=a; i<=b; i++)
        {
            if(i%3 == 0){
                sum += i;
                number++;
            }
        }

        System.out.println(sum/number);
    }
}