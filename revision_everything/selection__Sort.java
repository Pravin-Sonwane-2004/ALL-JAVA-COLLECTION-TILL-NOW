package revision_everything;
import java.util.Arrays;

public class selection__Sort {
    public static void selectionSort(int[] arr) {
        int m =0;
        int n = 0;
            for(int i = 0 ; i< arr.length ;i++) {
                n++;
                System.out.println();
                    System.out.print("Outer For : " + n);
                System.out.println();
                int minindex = i;
                for (int j = i+1; j < arr.length; j++) {
                    m++;
                    System.out.print("Inner For : " + m);
                System.out.println();
                    if(arr[j] < arr[minindex]) {
                        minindex = j;
                    }
                    }
                int temp = arr[minindex];
                arr[minindex]= arr[i];
                arr[i] = temp;
                System.out.println(Arrays.toString(arr));
            }
        }
        
        public static void main(String[] args) {
            int arr [] = {5,8,7,9,6,4,3,2,1};
            selectionSort(arr);
            System.out.println();
            System.out.println("Final Array : "+Arrays.toString(arr));
    }
}
