package revision_everything;
public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int result = a / b; // This line throws ArithmeticException
            System.out.println("Result: " + result);
        }
        catch(ArithmeticException exception) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        System.out.println("Program continues after exception handling.");
    }
}
