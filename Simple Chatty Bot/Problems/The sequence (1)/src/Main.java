import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = 0;
        while(n>0){
            m++;
            for(int i=0; i<m; i++){
                System.out.println(m);
                n--;
                if(n==0) break;
            }
        }
    }
}