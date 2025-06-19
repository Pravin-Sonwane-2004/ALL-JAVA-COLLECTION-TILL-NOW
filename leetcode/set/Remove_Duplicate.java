package set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Remove_Duplicate {

  public static List<String> arrayList() {
    return new ArrayList<>(List.of("Java", "MySQL", "React", "AWS", "Java", "JS", "JS", "JS", "JS"));

  }

  public static Set<String> removeDuplicate(List<String> arrList) {
    return new LinkedHashSet<>(arrList);
  }

  public static void main(String[] args) {
    List<String> list = Remove_Duplicate.arrayList();
    Set<String> set = Remove_Duplicate.removeDuplicate(list);
    List<String> uniqueList = new ArrayList<>(set);
    Collections.sort(uniqueList);
    for (String item : uniqueList) {
      System.out.println(item);
    }
  }
}
