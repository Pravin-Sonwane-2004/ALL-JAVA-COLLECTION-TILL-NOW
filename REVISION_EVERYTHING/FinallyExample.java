public class FinallyExample {
    public static void main(String[] args) {
        try {
            int a = 5 / 4;// Throws ArithmeticException
            System.out.println();
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("Finally block always executes.");
        }
        System.out.println("Program continues...");
    }
}
