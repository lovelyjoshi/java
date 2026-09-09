import java.util.Scanner;

// Bank Interface
interface Bank {
    void deposit(double amount);

    void withdraw(double amount);

    void displayBalance();
}

// SavingsAccount implements Bank
class SavingsAccount implements Bank {

    int accountNo;
    double balance;

    // Constructor
    SavingsAccount(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited successfully.");
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Display balance
    public void displayBalance() {
        System.out.println("Account Number: " + accountNo);
        System.out.println("Current Balance: " + balance);
    }
}

// Main class
public class BankDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Initialize account
        SavingsAccount account = new SavingsAccount(101, 5000);

        account.displayBalance();

        // Deposit
        System.out.print("\nEnter deposit amount: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        // Withdraw
        System.out.print("Enter withdrawal amount: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        // Final balance
        System.out.println("\nFinal Account Details:");
        account.displayBalance();

        sc.close();
    }
}