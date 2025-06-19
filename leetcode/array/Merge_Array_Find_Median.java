public class Merge_Array_Find_Median {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int m = nums1.length;
       int n = nums2.length;
       int i=0, j=0 ,k=0;
       int merged []= new int [m+n] ;
       while(i<m && j<n) {
        if(nums1[i]<nums2[j]) {
            merged[k++] = nums1[i++]; 
        }
        else {
            merged[k++] = nums2[j++];
        }

       }
       while (i<m) {
        merged[k++] = nums1[i++]; 
       }
       while (j<n) {
        merged[k++] = nums2[j++];
       }
       int len = merged.length;

       if (len % 2 == 1) {
         return merged[len /2];
       }
       else {
        return (merged[len / 2 - 1] + merged[len / 2]) / 2.0;
    }
    }
    public static void main(String[] args) {
        Merge_Array_Find_Median f = new Merge_Array_Find_Median();
        int [] nums1 = {1,3,4};
        int [] nums2 = {2};
        double medien =  f.findMedianSortedArrays(nums1, nums2);
        System.out.println(medien + " ");
    }
    
}
