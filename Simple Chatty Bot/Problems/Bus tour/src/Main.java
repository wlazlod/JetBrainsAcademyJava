import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int busHeight = scanner.nextInt();
        int bridges = scanner.nextInt();
        boolean flag = true;

        for(int i = 0; i < bridges; i++){
            int bridgeHeight = scanner.nextInt();
            if (bridgeHeight <= busHeight){
                System.out.print("Will crash on bridge ");
                System.out.println(i+1);
                flag = false;
                break;
            }
        }
        if(flag) System.out.println("Will not crash");
    }
}