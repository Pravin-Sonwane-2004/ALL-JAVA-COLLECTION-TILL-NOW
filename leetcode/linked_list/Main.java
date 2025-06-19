import java.util.*;

public class Main {
  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<>();
    list.add("Java");
    list.add("Spring");
    list.add("Microservices");
    list.addFirst("Pravin");
    list.addLast("ok");

    for (String item : list) {
      System.out.println(item);
    }
  }
}
