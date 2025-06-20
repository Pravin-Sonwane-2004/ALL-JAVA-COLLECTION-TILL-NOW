import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Find_Duplicates {
  public int[] removeDuplicates(int[] nums) {
    Set<Integer> set = new LinkedHashSet<>();
    for (int num : nums) {
      set.add(num);
    }
    int[] newarr = new int[set.size()];
    int i = 0;
    for (int num : set) {
      newarr[i++] = num;
    }
    return newarr;
  }

  public static void main(String[] args) {
    int[] num = { 1, 2, 2, 3, 3, 4, 5 };
    Find_Duplicates obj = new Find_Duplicates();
    System.out.println(Arrays.toString(obj.removeDuplicates(num)));
    // obj.removeDuplicates(num);
  }
}
