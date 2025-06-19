import java.util.Arrays;

public class Bubble_Sort {
    public static int [] Bubblesort (int arr[]) {
        int n = 0;
        int a = 0;
        for(int i = 0;i<arr.length-1;i++) {
            for(int j = 0;j<arr.length-i-1;j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                System.out.println();
                System.out.print(Arrays.toString(arr));
                n++;
            System.out.print(" Inner : " +  n);  
            }
            System.out.println();
            a++;
            System.out.print("Outer Loop : " + a );
        }
                return arr;
    }
    public static void main(String[] args) {
        int [] arr = {64, 34, 25, 12, 22, 11, 90};
        int [] i = Bubblesort(arr);
        System.out.println();
        System.out.println("Final : "+Arrays.toString(i));
    }
}