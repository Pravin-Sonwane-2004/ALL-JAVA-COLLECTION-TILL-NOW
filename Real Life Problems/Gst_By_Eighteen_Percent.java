public class Gst_By_Eighteen_Percent {
    public double actualAmount; // Corrected the typo from 'actialAmount'
    public double finalAmount;

    // Method to calculate GST
    public double Gstcalculator(double actualAmount) {
        final double GST_RATE = 18; // GST rate as 18%
        this.actualAmount = actualAmount;
        this.finalAmount = actualAmount + (actualAmount * GST_RATE / 100); // Calculate final amount
        return actualAmount * (GST_RATE / 100); // Return only the GST value
    }

    public static void main(String[] args) {
        Gst_By_Eighteen_Percent obj = new Gst_By_Eighteen_Percent();
        double gst = obj.Gstcalculator(1000); // Calculate GST for ₹1,000
        System.out.println("Actual Amount: ₹" + obj.actualAmount);
        System.out.println("GST (18%): ₹" + gst);
        System.out.println("Final Amount: ₹" + obj.finalAmount);
    }
}
