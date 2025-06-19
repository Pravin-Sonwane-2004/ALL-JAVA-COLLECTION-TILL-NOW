public class Remove_Duplicate_Ele {
    public int removeelement(int nums[], int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i]; // Move elements that are not equal to val
                j++;  // Increment j for the next valid element
            }
        }
        return j; // j is the length of the updated array
    }

    public static void main(String[] args) {
        Remove_Duplicate_Ele r = new Remove_Duplicate_Ele();
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 0;
        
        int newLength = r.removeelement(nums, val);

        // Print the remaining array after removing the value
        System.out.print("Remaining array after removing value " + val + ": ");
        System.out.println();
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " "); // Print valid elements in the array
        }
    }
}
