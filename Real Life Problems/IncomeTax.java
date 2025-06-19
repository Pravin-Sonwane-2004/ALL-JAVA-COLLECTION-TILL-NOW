public class IncomeTax {
    double income;
    double tax;

    // Method to calculate income tax based on slabs
    public void calculateTax(double income) {
        this.income = income;
        this.tax = 0; // Reset tax

        if (income <= 250000) {
            tax = 0; // No tax for income up to ₹2,50,000
        } 
        else if (income <= 500000) {
            tax = (income - 250000) * 0.05; // 5% for income between ₹2,50,001 to ₹5,00,000
        } 
        else if (income <= 1000000) {
            tax = (250000 * 0.05) + ((income - 500000) * 0.2); // 20% for income between ₹5,00,001 to ₹10,00,000
        } 
        else {
            tax = (250000 * 0.05) + (500000 * 0.2) + ((income - 1000000) * 0.3); // 30% for income above ₹10,00,000
        }

        // Apply rebate under Section 87A if income <= ₹7,00,000
        if (income <= 700000) {
            tax = 0;
        }
    }

    // Method to display tax details
    public void display() {
        System.out.println("Income: " + income);
        if (tax == 0) {
            System.out.println("No tax is payable for this income range (after rebate, if applicable).");
        } else {
            System.out.println("Tax Payable: " + tax);
        }
    }

    public static void main(String[] args) {
        IncomeTax obj = new IncomeTax();

        // Test cases for different income levels
        obj.calculateTax(1000000); // Input income ₹1,000,000
        obj.display();

        obj.calculateTax(500000); // Input income ₹500,000
        obj.display();

        obj.calculateTax(2000000); // Input income ₹2,000,000
        obj.display();

        obj.calculateTax(700000); // Input income ₹7,00,000
        obj.display();
    }
}
