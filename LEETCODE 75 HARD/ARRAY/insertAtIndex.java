public class insertAtIndex {
    private static int [] arrayinsert(int arr [] , int value , int index) {
        int newArr [] = new int[arr.length+1];
        for(int i = 0;i<newArr.length;i++) {
            if(i<index) {
                newArr[i] = arr[i];
            }
            else if(index == i) {
                newArr [i] = value; 
            }
            else {
                newArr [i] = arr [i-1]; 
            }
        }
        return newArr;
    }
    public static void main(String[] args) {
        int arr [] = {1,2,4,5,6};
        int index = 2;
        int  value = 3;
        int [] newArr = arrayinsert(arr, value, index);
        System.out.println("new array : ");
        for(int num : newArr) {
            System.out.println(num);
        }
    }
}