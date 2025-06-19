public class Practice {
    private static int [] Delete (int arr [] , int idx) {
        int Newarr [] = new int [arr.length-1];
        for(int i=0,j = 0;i<Newarr.length;i++) {
            if(i!=idx) {
                Newarr [j++] = arr[i];
            }
        }
        return Newarr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int idx = 3;
        int Newarr [] = Delete(arr, idx);
        for(int num : Newarr) {
            System.out.println(num);
        }
    }
}