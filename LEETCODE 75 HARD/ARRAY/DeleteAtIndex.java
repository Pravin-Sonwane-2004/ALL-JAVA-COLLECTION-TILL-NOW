public class DeleteAtIndex {
    public static int [] Delete (int arr[] , int index) {
        int [] NewArr = new int[arr.length-1];
        for(int i = 0,j = 0;i<arr.length;i++) {
            if(i != index) {
                NewArr[j++] = arr[i];
            }
        }
        return NewArr;
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8,9,10};
        int index = 5;
        System.out.println("Updated array : "); 
        int NewArr [] = Delete(arr, index);
        for(int num : NewArr) {
            System.out.print(num + " ");
        }
    }
}
