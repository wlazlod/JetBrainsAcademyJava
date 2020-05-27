import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positive_numbers = 0;
        for(int i=0; i<3; i++){
            int number = scanner.nextInt();
            positive_numbers += (number > 0) ? 1 : 0;
        }
        System.out.println(positive_numbers==1);
    }
}