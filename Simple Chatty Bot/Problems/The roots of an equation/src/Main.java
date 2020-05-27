import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int roots = 0;
        for(int i=0; i<1000; i++){
            int value = a*i*i*i + b*i*i + c*i + d;
            if(value == 0){
                System.out.println(i);
                roots++;
                if(roots >=3) break;
            }
        }
    }
}