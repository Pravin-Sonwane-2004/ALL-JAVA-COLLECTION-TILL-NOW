public class No_Argument_Constructor {
    int num;
    String txt;
    public No_Argument_Constructor () {
        num = 4;
        txt = "Pravin";
    }
    public static void main(String[] args) {
        No_Argument_Constructor obj = new No_Argument_Constructor();
        System.out.println(obj.num);
        System.out.println(obj.txt);
    }
    
}
