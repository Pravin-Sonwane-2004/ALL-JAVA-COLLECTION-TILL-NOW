import java.util.Arrays;

public class Sort_The_Array {
    public static void main(String[] args) {
        int [] arr = {5,7,9,4,6,3,1};
        Arrays.sort(arr);
        System.out.println( " Sorted array : ");
        for(int i = 0;i<arr.length-1;i++) {
            System.out.println(arr[i]);
        }
    }
}
