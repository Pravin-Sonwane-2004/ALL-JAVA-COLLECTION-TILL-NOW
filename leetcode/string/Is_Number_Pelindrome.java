import java.util.*;

public class Is_Number_Pelindrome {

  public static boolean isit(int str) {
    String toString = String.valueOf(str);
    String reversed = new StringBuilder(toString).reverse().toString();
    return reversed.equals(toString);
  }

  public static void main(String[] args) {
    int str = 12321;
    System.out.println(isit(str));
    // System.out.println(isit(str));

  }
}