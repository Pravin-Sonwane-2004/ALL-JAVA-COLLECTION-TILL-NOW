public class LinearSearch {
    public static int lsearch(int arr [] , int n) {
        for(int i =0;i<arr.length;i++) {
            if(arr[i] == n) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 6;
        int arr [] = {1,2,3,4,5,6,7,8,9,10};
        int l = lsearch(arr, n);
        System.out.println(l);
        
    }
}
