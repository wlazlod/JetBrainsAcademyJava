import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        int perDay = scanner.nextInt();
        int perNight = scanner.nextInt();

        int day = 0;
        int currentHeight = 0;
        while(currentHeight<height){
            day++;
            currentHeight += perDay;
            if (currentHeight >= height) break;
            currentHeight -= perNight;
        }

        System.out.println(day);
    }
}