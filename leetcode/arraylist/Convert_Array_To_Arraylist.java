import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Convert_Array_To_Arraylist {
  public static void main(String[] args) {
    
    String[] arr = { "Aws", "Java", "React", "Js", "Next" };
    List<String> list = new ArrayList<>(Arrays.asList(arr));
    for(String obj : list) {
      System.out.println(obj);
    }
  }
 
}
