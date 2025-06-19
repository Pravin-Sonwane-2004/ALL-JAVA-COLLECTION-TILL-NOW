import java.util.*;

public class Find_Median_Of_Two_Arrays {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int[] newArray = new int[nums1.length + nums2.length];
    int idx = 0;
    for (int i = 0; i < nums1.length; i++) {
      newArray[idx++] = nums1[i];
    }
    for (int i = 0; i < nums2.length; i++) {
      newArray[idx++] = nums2[i];
    }
    Arrays.sort(newArray);
    int mid = newArray.length / 2;
    int n = newArray.length;
    if (n % 2 == 0) {
      return mid;
    }
    // newArray ([mid-1])
    return (newArray[mid - 1] + newArray[mid]);

  }

  public static void main(String[] args) {
    int[] array1 = { 1, 22, 3 };
    int[] array2 = { 4, 5, 4 };
    Find_Median_Of_Two_Arrays obj = new Find_Median_Of_Two_Arrays();
    System.out.println(obj.findMedianSortedArrays(array1, array2));
  }
}