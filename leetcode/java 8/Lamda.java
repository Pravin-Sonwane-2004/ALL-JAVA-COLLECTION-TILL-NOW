import java.util.Arrays;
import java.util.List;

public class Lamda {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("A", "B", "C");

    list.forEach(item -> System.out.println(item));
  }

  
}