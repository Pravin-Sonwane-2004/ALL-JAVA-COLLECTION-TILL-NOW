public class MissingNumberFinder {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5}; 
        int n=5;
        int expsum = n*(n+1)/2;

        int actualsum = 0;

        for(int num : array) {
            actualsum += num;
        }
        int MissingNum = expsum - actualsum;
        System.out.println("Missing Num : " + MissingNum);
    }
}