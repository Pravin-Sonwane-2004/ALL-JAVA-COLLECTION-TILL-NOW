import java.util.Scanner;

// Enum for Account Types
enum AccountType {
    SAVINGS, CURRENT
}

// Bank Account Class
class BankAccount {
    private String accountHolder;
    private double balance;
    private final AccountType accountType; // Enum for Account Type
    private static final double SAVINGS_INTEREST = 4.5; // final interest rates
    private static final double CURRENT_INTEREST = 0.0;

    // Constructor
    public BankAccount(String accountHolder, double balance, AccountType accountType) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountType = accountType;
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        } else {
            balance += amount;
            System.out.println("Deposit Successful! New Balance: " + balance);
        }
    }

    // Withdraw Method with Exception Handling
    public void withdraw(double amount) {
        try {
            if (amount > balance) {
                throw new Exception("Insufficient Balance! Withdrawal Failed.");
            }
            balance -= amount;
            System.out.println("Withdrawal Successful! New Balance: " + balance);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Display Account Details
    public void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Type: " + accountType);
        System.out.println("Current Balance: " + balance);
        System.out.println("Interest Rate: " + getInterestRate() + "%");
    }

    // Calculate Interest
    public double calculateInterest() {
        double rate = getInterestRate();
        return (balance * rate) / 100;
    }

    // Get Interest Rate Based on Account Type
    private double getInterestRate() {
        return (accountType == AccountType.SAVINGS) ? SAVINGS_INTEREST : CURRENT_INTEREST;
    }
}

// Main Class
public class BankManagementSystem {
    static {
        System.out.println("=== Welcome to the Bank Management System ===");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        bankaccount account = null;

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Display Account Details");
            System.out.println("5. Calculate Interest");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Holder Name: ");
                    String name = scanner.next();
                    System.out.print("Enter Initial Balance: ");
                    double balance = scanner.nextDouble();
                    System.out.print("Enter Account Type (SAVINGS/CURRENT): ");
                    String type = scanner.next().toUpperCase();
                    AccountType accountType = AccountType.valueOf(type);
                    account = new bankaccount(balance);
                    System.out.println("Account Created Successfully!");
                    break;

                case 2:
                    if (account == null) {
                        System.out.println("No account found! Create an account first.");
                    } else {
                        System.out.print("Enter Amount to Deposit: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                    }
                    break;

                case 3:
                    if (account == null) {
                        System.out.println("No account found! Create an account first.");
                    } else {
                        System.out.print("Enter Amount to Withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                    }
                    break;

                case 4:
                    if (account == null) {
                        System.out.println("No account found! Create an account first.");
                    } else {
                        account.displayDetails();
                    }
                    break;

                case 5:
                    if (account == null) {
                        System.out.println("No account found! Create an account first.");
                    } else {
                        double interest = account.calculateInterest();
                        System.out.println("Interest Earned: " + interest);
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using the Bank Management System!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
