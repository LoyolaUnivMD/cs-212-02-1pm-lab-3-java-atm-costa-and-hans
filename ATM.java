import java.util.Scanner;
import java.text.DecimalFormat;
public class ATM
{
    Scanner input = new Scanner(System.in);
    DecimalFormat money = new DecimalFormat("$#,##0.00");
    private double totalMoney;


    public ATM(double totalMoney)
    {
        this.totalMoney = totalMoney;
    }

    public void menu()
    {
        System.out.println("(D)eposit\n(W)ithdrawal\n(C)heckBalance\n(E)xit");
    }

    public void Deposit()
    {
        System.out.println("How much would you like to Deposit?");
        double depositAmount = input.nextDouble();
        while(depositAmount < 0)
        {
            System.out.println("That is not a valid input\nPlease input a number 0 or greater");
            depositAmount = input.nextDouble();
        }
        totalMoney += depositAmount;
        System.out.println("Depositing " + money.format(depositAmount) + "\nAmount of money in account: " + money.format(totalMoney));
    }

    public void Withdrawal()
    {
        System.out.println("How much would you like to Withdrawal?");
        double withdrawAmount = input.nextDouble();
        while(withdrawAmount < 0 || withdrawAmount > totalMoney)
        {
            if (withdrawAmount < 0) {
                System.out.println("That is not a valid input\nPlease input a number 0 or greater");
            } else {
                System.out.println("You do not have sufficient funds to withdraw.\nEnter a valid amount: ");
            }
            withdrawAmount = input.nextDouble();
        }
        totalMoney -= withdrawAmount;
        System.out.println("Withdrawal " + money.format(withdrawAmount) + "\nAmount of money in account: " + money.format(totalMoney));
    }

    public void CheckBalance()
    {
        System.out.println("Amount of money in account: " + money.format(totalMoney));
    }

    public void Leave()
    {
        System.out.println("Would you like your receipt (P)rinted or (E)mailed?");
        String choice = input.next().strip().toUpperCase();
        while (!choice.equals("P") && !choice.equals("E"))
        {
            System.out.println("Not a valid input\nPlease input P or E");
            choice = input.nextLine().strip().toUpperCase();
        }
        if(choice.equals("P"))
        {
            System.out.println("Change in account: " + money.format(totalMoney - 212.90) + "\nThank you, Don't Forget your receipt!");
        }
        else {
            System.out.println("Change in account: " + money.format(totalMoney - 212.90) + "\nThank you, Don't Forget to check your email!");
        }
    }
}
