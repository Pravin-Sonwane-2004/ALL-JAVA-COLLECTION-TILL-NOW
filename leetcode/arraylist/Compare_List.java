import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Compare_List {
  public static void main(String[] args) {
    String[] arr = { "Aws", "Java", "React", "Js", "Next" };

    // ✅ Sort array by string length (ascending)
    Arrays.sort(arr, (a, b) -> Integer.compare(a.length(), b.length()));

    // ✅ Print the array
    System.out.println(Arrays.toString(arr));

    List<String> list1 = new ArrayList<>(List.of("Java", "Spring", "MySQL"));
    List<String> list2 = new ArrayList<>(List.of("Spring", "React", "Java"));

    list1.retainAll(list2);
    System.out.println("Common Elements: " + list1); // [Java, Spring]

  }
}

