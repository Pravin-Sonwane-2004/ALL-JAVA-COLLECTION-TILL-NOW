package revision_everything;
public class StringBuilderInsert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java Programming");

        // Insert a string
        sb.insert(05, "Language ");
        System.out.println("After insert: " + sb);  // Java Language Programming
    }
}
