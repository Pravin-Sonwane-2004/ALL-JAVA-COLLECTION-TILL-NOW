package revision_everything;
import java.util.Arrays;

public class Merge_Two_Sorted_Arrays {
    public static int [] merge ( int[] arr1 , int[] arr2) {
        int m = arr1.length,n = arr2.length;
        int [] mergedArray = new int[m+n];
            int i= 0; int j=0;int k =0;
            while (i<m && j<n) {
                if(arr1[i]<arr2[j]) {
                    mergedArray[k++] = arr1[i++];
                }
                else {
                    mergedArray[k++] = arr2[j++];
                }
            }
            while (j<n) {
                mergedArray[k++] = arr2[j++];
            }

            return mergedArray;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
          int[] result =merge(arr1, arr2);

        System.out.println("Merged Sorted Array: " + Arrays.toString(result));
    }
}