public class Sixteen_Table {
  public static void main(String[] args) {
    int x = 19;
    for (int i = 0; i <= x * 16; i++) {
      if (i % x == 0) {
        System.out.println(i);
      }
    }

  }
}