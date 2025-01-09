public class second_Highest {
    public static void main(String[] args) {
        int [] arr = {10,77,3,5,9,2};
        int max = Integer.MIN_VALUE;
        int SecMax = Integer.MIN_VALUE;
        for(int num : arr) {
            if(num>max) {
                SecMax = max;
                max = num;
            }
            else if (num > SecMax && num < max) {
                SecMax = num;
            }
        }
        if(SecMax == Integer.MIN_VALUE) {
            System.out.println("there is not any secondmax : ");
        }
        else {
            System.out.println("second max number : " + SecMax );
        }
    }
}