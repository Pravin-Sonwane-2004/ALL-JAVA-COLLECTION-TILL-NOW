public class Sum_Of_All_Numbers_In_Array {
    public static void main(String[] args) {
        int array [] = {1,8,9,7,5,3};
        int sum = 0;
        for(int i=0;i<array.length;i++) {
            sum += array[i];
        }
        System.out.println(sum); 
    }
}