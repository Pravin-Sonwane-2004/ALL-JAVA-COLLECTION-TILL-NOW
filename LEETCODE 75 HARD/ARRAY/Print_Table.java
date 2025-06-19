public class Print_Table {
    public static void Printtable(int t) {
        for(int i = 0; i<=10 ; i++) {           
            System.out.println(t*i);
        }
    }
    public static void main(String[] args) {
        int t = 2;
        Printtable(t);
    }
}
