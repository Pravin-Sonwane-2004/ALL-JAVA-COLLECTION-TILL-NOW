package revision_everything;
public class StringBuilderDelete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");

        // Delete a substring
        sb.delete(5, 11);
        System.out.println("After delete: " + sb);  // Hello
    }
}
