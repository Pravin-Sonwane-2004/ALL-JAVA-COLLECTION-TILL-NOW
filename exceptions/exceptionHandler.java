public class exceptionHandler {
public static void main(String[] args) {
  try {
    int result = 10 / 0;
  } catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero.");
  } finally {
    System.out.println("Cleanup if needed.");
  }
  
}
}
