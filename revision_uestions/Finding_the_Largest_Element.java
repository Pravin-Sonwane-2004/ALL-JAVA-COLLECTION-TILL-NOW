package revision_uestions;
public class Finding_the_Largest_Element {
    public static void main(String[] args) {
        int array [] = {1,8,9,3,7,4,5};
        int max = array[0];
        for(int i = 0 ;i<array.length;i++) {
            if(array[i]>max) {
                //compare the array values with max
                max = array[i];
            }
        }
        System.out.println("Max Num Is : " + max);
    }
}
