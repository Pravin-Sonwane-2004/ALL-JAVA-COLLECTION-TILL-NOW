public class Largest_Element_In_Array {
    public static int largestelement (int [] arr) {
        int max = arr[0];
        for(int i =0;i<arr.length;i++) {
            if(max<arr[i]) {
                max=arr[i];
            }
        }
                return max;
    }
    
    public static int smallest (int [] arr) {
        int min = arr[0];
        for(int i = 0;i<arr.length;i++) {
            if(arr [i] <min ) {
                min = arr[i];
            }
        }
        return min;
    
    }
    public static void main(String[] args) {
        int arr [] = {7,8,5,6,8,9,7,4,6,10};
        int res = largestelement(arr);
        System.out.println(res);
        int m = smallest(arr);
        System.out.println(m);
    }
}
