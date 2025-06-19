public class MultiplicationTable {
    public static void main(String[] args) {
        int size = 10; // Table size

        // Print the header row
        System.out.print("    ");
        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        // Print the rows
        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d", i); // Row header
            for (int j = 1; j <= size; j++) {
                System.out.printf("%4d", i * j); // Table cell
            }
            System.out.println();
        }
    }
}
