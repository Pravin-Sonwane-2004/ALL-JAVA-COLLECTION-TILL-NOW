import java.util.Arrays;

public class Remove_Duplicates_Array {
  public int removedElements(int nums []) {
    int j = 0;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == nums[j]) {
        nums[j] = nums[i];
      }
      return i + 1;
    }
    return j;
  
  } 

  public static void main(String[] args) {
    int[] arr = { 0, 0, 1, 1, 2 };
    Remove_Duplicates_Array obj = new Remove_Duplicates_Array();
    obj.removedElements(arr);
  }
}
