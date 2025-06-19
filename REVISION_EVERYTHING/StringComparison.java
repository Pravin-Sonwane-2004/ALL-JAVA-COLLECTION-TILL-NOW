public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = "JAVA";

        System.out.println(str1.equals(str2));  // true (case-sensitive comparison)
        System.out.println(str1.equals(str3));  // false
    }
}
