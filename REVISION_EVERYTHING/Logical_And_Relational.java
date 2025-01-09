public class Logical_And_Relational {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
        if(c<a+b && b<a+c && a<c+b) {
            System.out.println("valid triangle");
        }
        else {
            System.out.println("invalid");
        }
    }
}
