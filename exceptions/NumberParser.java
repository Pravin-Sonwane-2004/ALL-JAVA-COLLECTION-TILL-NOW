public class NumberParser {
  public static void parseAndDivide(String input) {
    try {
      int num = Integer.parseInt(input);
      int result = 100 / num;
      System.out.println(result);
    } catch (NumberFormatException e) {
      System.out.println("Invalid number");
    } catch (ArithmeticException e) {
      System.out.println("Cannot divide by zero");
    }
  }

  public static void main(String[] args) {
    parseAndDivide("10");
    parseAndDivide("0");
    parseAndDivide("abc");
  }
}
