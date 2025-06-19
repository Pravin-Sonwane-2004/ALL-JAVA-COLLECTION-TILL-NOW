package revision_everything;
import java.util.Arrays;

public class Shift_All_Zeros {
    public static void main(String[] args) {
        int [] arr = {8,0,0,3,12};      
        // {1,3,12,0,0};
        int index =0;
        //treverse the array
        for(int num : arr){
            if(num != 0){
                arr[index++] = num;
            }
        }
        //fill the remaining array with zeros

        while ((index < arr.length)){
            arr[index++] = 0;
        }
        System.out.println("after shifting " + Arrays.toString(arr));
    }
}
