import java.util.Random;
import java.util.HashSet; //importing HashSet for efficient storage
public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;
    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances
    private static HashSet<Long> allAccountNumbers = new HashSet<>(); //stores all account numbers to insure no duplicates
    private long accountNumber; // instance variable

    // CONSTRUCTOR
    // Be sure to increment the number of accounts
    public BankAccount() {
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        
        long accountNum = generateAccountNum();
        while (allAccountNumbers.contains(accountNum)) {
            accountNum = generateAccountNum();
        } 
        this.accountNumber = accountNum;
        accounts++;
    }
    
    // GETTERS
    // for checking, savings, accounts, and totalMoney

    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public static int getNumAccounts() {
        return accounts;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }
    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account
    public void depositChecking(double amount) {
        this.checkingBalance += amount;
        totalMoney += amount;
        System.out.printf("$%.2f successfully deposited! Your total checking balance is now $%.2f%n", amount, this.checkingBalance);
        }

    public void depositSavings(double amount) {
        this.savingsBalance += amount;
        totalMoney += amount;
        System.out.printf("$%.2f successfully deposited! Your total savings balance is now $%.2f%n", amount, this.savingsBalance);

    }
    
    // withdraw 
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    public boolean withdrawChecking(double amount) {
        if (amount > this.checkingBalance) {
            System.out.println("You have insufficient funds in your checking account. Transaction cancelled.");
            return false;
        } else {
            this.checkingBalance -= amount;
            System.out.printf("You have withdrawn $%.2f. Your remaining checking balance is $%.2f%n", amount, this.checkingBalance);
            totalMoney -= amount;
            return true;
        }
    }

    public boolean withdrawSavings(double amount) {
        if (amount > this.savingsBalance) {
            System.out.println("You have insufficient funds in your savings account. Transaction cancelled.");
            return false;
        } else {
            this.savingsBalance -= amount;
            System.out.printf("You have withdrawn $%.2f. Your remaining savings balance is $%.2f%n", amount, this.savingsBalance);
            totalMoney -= amount;
            return true;
        }
    }
    
    // getBalance
    // - display total balance for checking and savings of a particular bank account
    public double getBalance() {
        double totalBalance = this.checkingBalance + this.savingsBalance;
        System.out.printf("Your total account balance is $%.2f%n", totalBalance);
        return totalBalance;
    }

    // Ninja Bonus 2 - random ten digit account number
    private long generateAccountNum() {
        Random rand = new Random();
        // Generate a random 10 digit number directly.
        long accNum = 1_000_000_000L + rand.nextLong(9_000_000_000L);
        return accNum;
    }
}
