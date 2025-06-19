package revision_uestions;
public class Swap_Two_Numbers {
    public static void main(String[] args) {
        int x=5;
        int y=7;
        x = x+y;
        y = x-y;
        x = x-5;
        System.out.println("x = " + x + " " + "y = " + y);

        //with using temp
        int a=5;
        int b=7;
        int temp = a;
        a=b;
        b = temp;
      
        System.out.println(a+ " " +b);

        
    }
}