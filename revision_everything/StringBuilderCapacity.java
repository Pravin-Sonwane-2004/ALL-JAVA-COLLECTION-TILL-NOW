public class StringBuilderCapacity {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        // Get capacity
        System.out.println("Capacity: " + sb.capacity());  // Default is 16 + length of string

        // Ensure minimum capacity
        sb.ensureCapacity(50);
        System.out.println("New capacity: " + sb.capacity());  // At least 50
    }
}
