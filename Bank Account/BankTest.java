public class BankTest {
    public static void main(String[] args){
        
        // Create 3 bank accounts
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();
        
        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney
        System.out.println("\nDeposits:");
        account1.depositChecking(500);
        account1.depositSavings(1000);

        account2.depositChecking(1500);
        account2.depositSavings(2000);
        
        account3.depositChecking(300);
        account3.depositSavings(700);
        
        System.out.printf("\nTotal Money after Deposits: $%.2f\n", BankAccount.getTotalMoney());
        
        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney
        System.out.println("\nWithdrawals:");
        account1.withdrawChecking(100);
        account1.withdrawSavings(200);
        
        account2.withdrawChecking(300);
        account2.withdrawSavings(400);
        
        account3.withdrawChecking(50);
        account3.withdrawSavings(100);
        
        System.out.printf("\nTotal Money after Withdrawals: $%.2f\n", BankAccount.getTotalMoney());
        
        // Static Test (print the number of bank accounts and the totalMoney)
        System.out.println("\nStatic Info:");
        System.out.printf("Number of Bank Accounts: %d%n", BankAccount.getNumAccounts());
        System.out.printf("Total Money in All Accounts: $%.2f\n", BankAccount.getTotalMoney());
    }
}
