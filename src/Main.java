// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        account1.deposit(1200.0, "checking");
        account1.deposit(600.0, "savings");

        account2.deposit(2000.0, "checking");

        System.out.println("Account 1 - Checking Balance: $" + account1.getCheckingBalance());
        System.out.println("Account 1 - Savings Balance: $" + account1.getSavingsBalance());

        System.out.println("Account 2 - Checking Balance: $" + account2.getCheckingBalance());

        boolean withdrawSuccess = account1.withdraw(300.0, "checking");
        if (withdrawSuccess) {
            System.out.println("Withdraw success. New Checking Balance: $" + account1.getCheckingBalance());
        } else {
            System.out.println("Insufficient funds.");
        }

        System.out.println("Total Money in all accounts: $" + BankAccount.getTotalMoneyStored());
    }
}
