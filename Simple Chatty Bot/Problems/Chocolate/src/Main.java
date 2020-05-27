import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int bits = scanner.nextInt();

        int size = length * width;

        if(bits > size){
            System.out.println("NO");
        } else if (bits%width == 0 || bits%length == 0){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }

    }
}