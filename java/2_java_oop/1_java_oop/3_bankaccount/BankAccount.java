public class BankAccount {
    private double checkingBalance; 
    private double savingsBalance;
    private static int numberOfAccounts; 
    private static double totalBalance;

    public BankAccount() {
        double checkingBalance = 0.0;
        double savingsBalance = 0.0;
        numberOfAccounts++;
        System.out.println("Current number of account is " + numberOfAccounts +  ".");
    }

    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public void deposit(String account, double depositAmount) {
        if (account == "checking" || account == "Checking") {
            this.checkingBalance += depositAmount;
            this.totalBalance += depositAmount;
            System.out.println("You deposited " + "$" + depositAmount + " to your " + account + " account.");
        }
        else if (account == "savings" || account == "Savings") {
            this.savingsBalance += depositAmount;
            this.totalBalance += depositAmount;
            System.out.println("You deposited " + "$" + depositAmount + " to your " + account + " account.");
        }
        else {
            System.out.println("Not a valid account");
        }
    }

    public void withdraw(String account, double withdrawAmount) {
        if (account == "checking" || account == "Checking") {
            if (checkingBalance >= withdrawAmount) {
                checkingBalance -= withdrawAmount;
                totalBalance -= withdrawAmount;
                System.out.println("You withdrew $" + withdrawAmount + ".");
            }
            else {
                System.out.println("You do not have sufficient fund.");
            }
        }
        if (account == "savings" || account == "Savings") {
            if (savingsBalance >= withdrawAmount) {
                savingsBalance -= withdrawAmount;
                totalBalance -= withdrawAmount;
                System.out.println("You withdrew $" + withdrawAmount + ".");
            }
            else {
                System.out.println("You do not have sufficient fund.");
            }
        }
    }

    public void display() {
        System.out.println("----------Account Summary----------");
        System.out.println("Current balance in your checking account: $" + checkingBalance);
        System.out.println("Current balance in your savings account: $" + savingsBalance);
    }

}