import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the user's name from input
        System.out.println("What is your name? ");
        String name = input.next();

        // Create a new ATM object using the money that the user has and their name
        ATM userInfo = new ATM(212.90, name);
        // Greet the user using the name that they inputted
        System.out.println("Hello " + userInfo.name + "!");

        // Get the user's initial choice
        String choice = ATM.menu();

        // While the user doesn't choose to exit
        while (!choice.equals("E")) {
            // If the user chooses to deposit
            if (choice.equals("D")) {
                ATM.deposit();
            }
            // If the user chooses to withdraw
            else if (choice.equals("W")) {
                ATM.withdraw();
            }
            // If the user chooses to check balance
            else if (choice.equals("C")) {
                ATM.checkBalance();
            }
            // If the input is invalid
            else {
                System.out.println("Please enter a valid choice (D/W/C/E): ");
                choice = ATM.menu();
            }
        }
        // When the code has reached this point, the user has chosen to leave
        ATM.leave();
    }
}
