import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        boolean flag = true;
        boolean same = n1==n2;
        boolean ascending = (n1<n2);

        while(n2!=0){
            n1 = n2;
            n2 = scanner.nextInt();
            if(n2==0) break;

            if(same){
                if(n1!=n2) {
                    ascending = (n1 < n2);
                    same = false;
                }
            }
            else{
                boolean currentAscending = (n1<n2);
                if(currentAscending!=ascending && n1!=n2){
                    flag = false;
                    break;
                }
            }
        }
        System.out.println(flag);
    }
}