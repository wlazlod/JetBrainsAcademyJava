import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = 0;
        int desks = 0;
        for(int i=0; i<3; i++){
            students = scanner.nextInt();
            desks += students/2 + students%2;
        }

        System.out.println(desks);
    }
}