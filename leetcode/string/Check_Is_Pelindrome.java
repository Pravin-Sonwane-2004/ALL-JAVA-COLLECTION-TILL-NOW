
public class Check_Is_Pelindrome {
  public static boolean isit(String str) {
    for (int i = 0; i < str.length() / 2; i++) {
      int n = str.length();
      if (str.charAt(i) != str.charAt(n - 1 - i)) {

        return false;
      }
    }
    return true;
  }
    
  public static boolean isPalindrome(String str) {
    String reversed = new StringBuilder(str).reverse().toString();
    return str.equals(reversed);
  }

    public static void main(String[] args) {
      String str = "racecar";
        System.out.println(isPalindrome(str));
        System.out.println(isit(str));
    }
}

