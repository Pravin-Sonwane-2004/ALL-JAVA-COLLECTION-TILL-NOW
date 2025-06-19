class bankaccount {
    private double balance;

    public bankaccount(double balance) {
        this.balance = balance;
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        synchronized (this) { // Synchronize access to this block
            System.out.println(Thread.currentThread().getName() + " is trying to withdraw " + amount);
            if (balance >= amount) {
                System.out.println(Thread.currentThread().getName() + " successfully withdrew " + amount);
                balance -= amount;
                System.out.println("Remaining balance: " + balance);
            } else {
                System.out.println(Thread.currentThread().getName() + " failed to withdraw due to insufficient balance.");
            }
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double depositAmount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deposit'");
    }

    public void displayDetails() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayDetails'");
    }

    public double calculateInterest() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateInterest'");
    }
}

public class SynchronizedBlocATM {
    public static void main(String[] args) {
        // Shared bank account resource
        bankaccount account = new bankaccount(500);

        // User 1 thread
        Thread user1 = new Thread(() -> account.withdraw(300), "User1");

        // User 2 thread
        Thread user2 = new Thread(() -> account.withdraw(300), "User2");

        // Start threads
        user1.start();
        user2.start();
    }
}
