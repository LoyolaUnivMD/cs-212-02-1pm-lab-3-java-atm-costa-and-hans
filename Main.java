// Programmers:  Costa Marmaras, Hans Van Lierop
// Course:  CS 212
// Due Date: 2/11/24
// Lab Assignment: 3
// Problem Statement: You work at a bank and your current project is to design and implement a new interface for a new generation of ATMs.
// Data In: name, what you want to do
// Data Out: balance, how much withdrawn, change in account
// Credits: [Is your code based on an example in the book, in class, or something else?
//            Reminder: you should never take code from the Internet or another person

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the user's name from input
        System.out.println("What is your name? ");
        String name = input.next();

        // Create a new ATM object using the money that the user has and their name
        ATM userInfo = new ATM(212.90);
        // Greet the user using the name that they inputted
        System.out.println("Hello " + name + "!");

        // Get the user's initial choice
        userInfo.menu();
        String choice = input.next();

        // While the user doesn't choose to exit
        while (!choice.equals("E")) {

            switch (choice) {
                // If the user chooses to deposit
                case "D" -> userInfo.Deposit();

                // If the user chooses to withdraw
                case "W" -> userInfo.Withdrawal();

                // If the user chooses to check balance
                case "C" -> userInfo.CheckBalance();

                // If the input is invalid
                default -> System.out.println("Please enter a valid choice (D/W/C/E): ");
            }
            userInfo.menu();
            choice = input.next();
        }
        // When the code has reached this point, the user has chosen to leave
        userInfo.Leave();
    }
}
