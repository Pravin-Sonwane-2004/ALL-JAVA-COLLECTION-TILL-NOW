import java.util.Arrays;
public class ArraysClassPractice {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8,9};
        int arru [] = {5,27,2,3,4,8,1};
        System.out.println("Check equal to : " + Arrays.equals(arr, arru));
        int[] newarr = Arrays.copyOf(arru, 10);
        System.out.println(Arrays.toString(newarr));
        Arrays.sort(arru);
        int k = Arrays.binarySearch(arr, 5);
        System.out.println(" Convert array to string : " + Arrays.toString(arru));
        System.out.println(k);
            }
}