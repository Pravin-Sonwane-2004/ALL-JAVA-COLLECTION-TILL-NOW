import java.util.ArrayList;
import java.util.List;

public class Print_3rd_Element {
  public static List<String> createList() {
    List<String> names = new ArrayList<>();
    names.add("Java");
    names.add("Spring");
    names.add("MySQL");
    names.add("React");
    names.add("AWS");
return names;
  }

  public static String retString(List<String> names) {
    return names.size() >= 3 ? names.get(2) : "Not Enough Space";
  }

  public static void main(String[] args) {
    List<String> list = Print_3rd_Element.createList();
    String res = Print_3rd_Element.retString(list);
    System.out.println(res);
  }
  

}
