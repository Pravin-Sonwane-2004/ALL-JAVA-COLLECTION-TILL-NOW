public class Calculator {
  public static double divide(double a, double b) {
    try {
      return a / b;
    } catch (ArithmeticException e) {
      System.out.println("Cannot divide by zero.");
      return -1;
    }
  }

  public static void main(String[] args) {
    // System.out.println(divide(10, 2)); // 5
    // System.out.println(divide(9, 2)); // 5
    System.out.println(divide(11, 2)); // 5

    // System.out.println(divide(5, 0)); // -1
  }
}
