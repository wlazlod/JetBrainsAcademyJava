import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        String firstName = scanner.next();
        String age = scanner.next();
        String educationStage = scanner.next();
        String experienceYears = scanner.next();
        String cuisinePreference = scanner.next();

        System.out.println(String.format("The form for %s is completed. We will contact you if we need a chef that cooks %s dishes.", firstName, cuisinePreference));
    }
}