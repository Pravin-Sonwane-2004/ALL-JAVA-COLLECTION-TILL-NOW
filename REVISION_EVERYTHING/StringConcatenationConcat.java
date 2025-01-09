public class StringConcatenationConcat {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Java";

        // Concatenation using concat()
        String result = str1.concat(" ").concat(str2);
        System.out.println("Using concat(): " + result);
    }
}
