public class MaxDiffInIncreasingElements {
  public double maximumDifference(int[] nums) {
    int maxDiff = -1;
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = 0; j < nums.length; j++) {
        if (nums[j] > nums[i]) {
          maxDiff = Math.max(maxDiff, nums[j] - nums[i]);

        }
      }
    }
    return maxDiff;
  }

  public static void main(String[] args) {
    int nums[] = { 5, 8, 9, 10 };
    MaxDiffInIncreasingElements obj = new MaxDiffInIncreasingElements();
    System.out.println(obj.maximumDifference(nums));
  }
}