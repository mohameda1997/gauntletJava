public class BankAccount {
    private static int numberOfAccountsCreated = 0;
    private static double totalMoneyStored = 0;

    private double checkingBalance;
    private double savingsBalance;

    public BankAccount() {
        numberOfAccountsCreated++;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void deposit(double amount, String accountType) {
        if (accountType.equalsIgnoreCase("checking")) {
            checkingBalance += amount;
        } else if (accountType.equalsIgnoreCase("savings")) {
            savingsBalance += amount;
        }
        totalMoneyStored += amount;
    }

    public boolean withdraw(double amount, String accountType) {
        if (accountType.equalsIgnoreCase("checking") && checkingBalance >= amount) {
            checkingBalance -= amount;
            totalMoneyStored -= amount;
            return true;
        } else if (accountType.equalsIgnoreCase("savings") && savingsBalance >= amount) {
            savingsBalance -= amount;
            totalMoneyStored -= amount;
            return true;
        } else {
            return false; // Insufficient funds
        }
    }

    public static int getNumberOfAccountsCreated() {
        return numberOfAccountsCreated;
    }

    public static double getTotalMoneyStored() {
        return totalMoneyStored;
    }

    public double getTotalBalance() {
        return checkingBalance + savingsBalance;
    }


}

