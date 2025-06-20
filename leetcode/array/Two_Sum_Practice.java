import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum_Practice {
  public static int[] returnIndexes(int[] arr, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      int comp = target - arr[i];
      if (map.containsKey(comp)) {
        return new int[] { map.get(i), i };
      }
      map.put(arr[i],i);
    }
    return new int[0];
  }
  public static void main(String[] args) {
    int[] n = { 3, 1, 5, 7 };
    Two_Sum_Practice obj = new Two_Sum_Practice();
    System.out.println(Arrays.toString(obj.returnIndexes(n, 10)));
  }
}
