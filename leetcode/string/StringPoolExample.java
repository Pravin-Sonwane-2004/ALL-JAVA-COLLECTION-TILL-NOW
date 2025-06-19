public class StringPoolExample {
  public static void main(String[] args) {
    String str1 = "Java"; // goes into String Constant Pool
    String str2 = "Java"; // refers to same object as str1 (from SCP)

    String str3 = new String("Java"); // new object in heap (not same as str1 or str2)

    System.out.println(str1 == str2); // true → same reference (SCP)
    System.out.println(str1 == str3); // false → different object (heap vs SCP)
    System.out.println(str1.equals(str3)); // true → values are same
  }
}
