import java.util.Arrays;
import java.util.List;

public class Lamda {
  public static void main(String[] args) {
      List<String> list = Arrays.asList("A", "B", "C");
      List<String> names = Arrays.asList("John", "Jane", "Tom");
      names.stream()
          .forEach(name -> System.out.println(name));

    // list.forEach(item -> System.out.println(item));
  }

  
}