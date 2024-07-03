import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            Menu.displayMenu();
            int choice = scanner.nextInt();
            Menu.processChoice(choice, scanner);

            System.out.println("Do you want to perform another calculation? (yes/no)");
            String userResponse = scanner.next();
            if (!userResponse.equalsIgnoreCase("yes")) {
                continueProgram = false;
            }
        }

        scanner.close();
        System.out.println("Thank you for using the Financial Mathematics program!");
    }
}
