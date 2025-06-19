package revision_everything;
public class StringBuilderAppend {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        // Append a string
        sb.append(" World");
        System.out.println("After append: " + sb);  // Hello World

        // Append a number
        sb.append(123);
        System.out.println("After appending number: " + sb);  // Hello World123
    }
}
