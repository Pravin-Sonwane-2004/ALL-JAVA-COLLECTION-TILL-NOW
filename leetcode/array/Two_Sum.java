import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum {

  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (map.containsKey(complement)) {
        return new int[] { map.get(complement), i };

      }
      map.put(nums[i], i);
    }
    return new int[0]; 
  }

  public static void main(String[] args) {
    int[] n = { 3, 1, 5, 7 };
    Two_Sum obj = new Two_Sum();
    System.out.println(Arrays.toString(obj.twoSum(n, 10)));
  }
}