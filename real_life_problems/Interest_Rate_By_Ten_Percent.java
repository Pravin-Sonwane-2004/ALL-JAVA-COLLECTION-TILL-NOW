class bankAccount { // Renamed to follow PascalCase
    static double interestRate = 10.0; // Static interest rate
    String accountHolder; // Instance variable for account holder
    double balance; // Instance variable for balance

    // Constructor to initialize balance and account holder
    bankAccount(double balance, String accountHolder) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Method to display account details
    public void display() {
        double balanceWithInterest = balance + (balance * (interestRate / 100)); // Calculate balance with interest
        System.out.println("Account Holder: " + accountHolder 
            + ", Original Balance: " + balance 
            + ", Balance with Interest: " + balanceWithInterest 
            + ", Interest Rate: " + interestRate + "%");
    }
}

public class Interest_Rate_By_Ten_Percent {
    public static void main(String[] args) {
        bankAccount ac1 = new bankAccount(275000, "Pravin"); // Object creation
        ac1.display(); // Display account details
    }
}
