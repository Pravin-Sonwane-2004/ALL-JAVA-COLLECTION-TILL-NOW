import java.util.ArrayList;
import java.util.Arrays;
public class Print_Reverse_Using_Recursion {

    // public static ArrayList<Integer> Reversearraylist (ArrayList<Integer> list , int idx) {
    //     if (idx<0) {
    //         return new ArrayList<>();
    //     }
    //     ArrayList <Integer> reversed  =  Reversearraylist(list, idx -1);
    //     reversed.add(0,list.get(idx));
    //     return reversed;
    // }
    
    public static void Reversearraylist (ArrayList<Integer> list , int left , int right) {
        if(left >=right) {
            return;
        }

        int temp = list.get(left);
        list.set(left,list.get(right));
        list.set(right, temp);
        Reversearraylist(list, left+1, right-1);
    }
    

public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
   
    System.out.println("Origional : "+list);

   // ArrayList <Integer> reversed = Reversearraylist(list, list.size()-1);
    //System.out.println(reversed);

    Reversearraylist(list, 0, list.size()-1);
    System.out.println(list);
}    
}
