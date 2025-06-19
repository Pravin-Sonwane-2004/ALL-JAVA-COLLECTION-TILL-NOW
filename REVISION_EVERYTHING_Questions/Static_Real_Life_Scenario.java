
public class Static_Real_Life_Scenario {
    static double interestRate = 3.5; // Shared interest rate
    String accountHolder;
    double balance;

    Static_Real_Life_Scenario(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance; // Store the original balance
    }

    void display() {
        double balanceWithInterest = balance + (balance * (interestRate / 100)); // Calculate balance with interest dynamically
        System.out.println("Account Holder: " + accountHolder 
            + ", Original Balance: " + balance 
            + ", Balance with Interest: " + balanceWithInterest 
            + ", Interest Rate: " + interestRate + "%");
    }

    public static void main(String[] args) {
        Static_Real_Life_Scenario acc1 = new Static_Real_Life_Scenario("Alice", 1000);
        Static_Real_Life_Scenario acc2 = new Static_Real_Life_Scenario("Bob", 2000);

        // Display initial details
        acc1.display();
        acc2.display();

        // Update static interest rate
        Static_Real_Life_Scenario.interestRate = 10;

        // Display details after updating the interest rate
        acc1.display();
        acc2.display();
    }
}
