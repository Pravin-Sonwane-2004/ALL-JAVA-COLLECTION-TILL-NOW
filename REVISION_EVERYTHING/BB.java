import java.util.Arrays;

public class BB {
    public static void selectionSort(int[] arr) {
            for(int i = 0; i<arr.length;i++) {
                int minindex = i;
                for(int j = 0;j<arr.length;j++) {
                    if(arr[j]<arr[minindex]) {
                        minindex=j;
                    }
                    int temp = arr[minindex];
                    arr[minindex] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        
        public static void main(String[] args) {
            int arr [] = {5,8,7,9,6,4,3,2,1};
            selectionSort(arr);
            System.out.println(Arrays.toString(arr));
    }
}
