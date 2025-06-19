import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LearningForEach {
  public static void printTable(Set<Integer> list) {
    List<Integer> newList = new ArrayList<>(list);
    newList.forEach(num -> {
      if (num % 2 == 0) {
        System.out.println(num);
      }
    });
  }

  public static void main(String[] args) {
    Set<Integer> newList = new LinkedHashSet<>(List.of(4, 5, 6, 4, 8, 6, 8, 2, 1, 2, 5, 9, 8, 6));
    LearningForEach.printTable(newList);;
  }
}
