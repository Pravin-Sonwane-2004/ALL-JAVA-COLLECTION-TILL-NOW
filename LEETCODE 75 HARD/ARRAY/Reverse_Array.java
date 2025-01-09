import java.util.Arrays;
public class Reverse_Array {
    public static int [] reverse (int arr []) {
        int start = 0;
        int end = arr.length-1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = arr[temp];
            start ++;
            end--;     
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6};
        int[] a = reverse(arr);
        System.out.println(Arrays.toString(a));
        for(int i = 0; i<arr.length;i++) {
            System.out.print(a[i] + " ");
        }
    }
}