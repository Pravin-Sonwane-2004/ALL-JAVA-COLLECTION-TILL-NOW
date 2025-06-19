package set;

import java.util.TreeSet;

public class Test {
  public static void main(String[] args) {
    TreeSet<Integer> set = new TreeSet<>();
    set.add(5);
    set.add(2);
    set.add(10);
    set.add(5);
    set.add(1);

    System.out.println(set);
  }
}
