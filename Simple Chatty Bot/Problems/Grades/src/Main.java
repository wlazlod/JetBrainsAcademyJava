import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int elementsNumber = scanner.nextInt();
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int sum5 = 0;

        for(int i=0; i<elementsNumber; i++){
            int element = scanner.nextInt();
            if(element==2) sum2++;
            else if (element==3) sum3++;
            else if (element==4) sum4++;
            else if (element==5) sum5++;
        }

        System.out.println(String.format("%d %d %d %d", sum2, sum3, sum4, sum5));
    }
}