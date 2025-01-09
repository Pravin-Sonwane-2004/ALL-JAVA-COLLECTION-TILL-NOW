import java.util.ArrayList;

public class Generics {
     public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); //only integers can be added to this list
        list.add(6);
        System.out.println(list);
     }
}