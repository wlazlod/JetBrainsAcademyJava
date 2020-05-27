import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int elementsNumber = scanner.nextInt();
        int sumPos = 0;
        int sumNeg = 0;
        int sumZero = 0;

        for(int i=0; i<elementsNumber; i++){
            int element = scanner.nextInt();
            if(element==0) sumZero++;
            else if (element>0) sumPos++;
            else if (element<0) sumNeg++;
        }

        System.out.println(String.format("%d %d %d", sumZero, sumPos, sumNeg));
    }
}