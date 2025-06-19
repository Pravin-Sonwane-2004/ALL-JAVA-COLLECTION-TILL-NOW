
import java.util.ArrayList;
import java.util.List;

public class Operations_On_Arraylist {

  public static List<String> element() {
    List<String> names = new ArrayList<>();
    names.add("Java");
    names.add("Spring");
    names.add("MySQL");
    names.add("React");
    names.add("AWS");
    return names;
  }
  
  public static String returnElement(List<String> gete, String req) {
    return gete.contains(req) ? "Element Found " : "Couldent Found";
  }

  public static String removeReact(List<String> rem) {
    return rem.remove(3);
  }

  public static int SizeOfList(List<String> list) {
    int size;
    return size = list.size();
  }
    
  public static List<String> reverseList(List<String> list) {
    List<String> revList = new ArrayList<>();
    for (int i = list.size() - 1; i >= 0; i--) {
      revList.add(list.get(i));
    }
    return revList;
  }
    
  public static void main(String[] args) {

    // List<String> g = Check_If_Element_Exist.element();
    // String input = Check_If_Element_Exist.returnElement(g, "Java");
    // for (String obj : g) {
    //   System.out.println(obj);
    // }
    // int size = Check_If_Element_Exist.SizeOfList(g);
    // System.out.println(size);
    // System.out.println();
    // String remove = removeReact(g);

    // for(String obj : g) {
    //   System.out.println(obj);
    // }
    // List<String> rev = Check_If_Element_Exist.reverseList(g);
    // for (String obj : rev) {
    //   System.out.println(obj);
    // }
  }
  
}