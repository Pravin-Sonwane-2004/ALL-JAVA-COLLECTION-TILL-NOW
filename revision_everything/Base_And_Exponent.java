public class Base_And_Exponent {
    public static void main(String[] args) {
        int exp = 5;
        int base = 2;
        int res = 1;
        for(int i = 1;i<=exp;i++) {
            res *= base;
        }
        System.out.println(res);
    }
}
