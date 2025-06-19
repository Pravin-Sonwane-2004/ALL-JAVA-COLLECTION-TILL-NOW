public class Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        int left = 0 ;
        int right = nums.length-1;
        while (left<=right) {
            int mid = left +(right - left)/2;
            if(nums[mid] == target) {
                return mid;
            }
            else if(target < nums [mid]) {
              right =  mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int nums [] = {1,2,3,4,6};
        int target = 5;
        Search_Insert_Position s = new Search_Insert_Position();
        int r = s.searchInsert(nums, target);
        System.out.println(r);

    }
    
}
