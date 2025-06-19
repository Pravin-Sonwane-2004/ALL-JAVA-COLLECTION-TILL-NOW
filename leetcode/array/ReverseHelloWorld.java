public class ReverseHelloWorld {
    public static void main(String[] args) {
        String input = "Hello World";
        String[] words = input.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (String word : words) {
            reversed.append(new StringBuilder(word).reverse().toString()).append(" ");
        }
        System.out.println(reversed.toString().trim());
    }
}
