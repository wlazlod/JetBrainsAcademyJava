import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int duration = scanner.nextInt();
        int foodCostPerDay = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int hotelCostPerNight = scanner.nextInt();

        int cost = flightCost * 2 + foodCostPerDay * duration + hotelCostPerNight * (duration - 1);

        System.out.println(cost);
    }
}