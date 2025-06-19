package revision_everything;
public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        // Dynamically building a sentence
        sb.append("The quick ");
        sb.append("brown fox ");
        sb.append("jumps over ");
        sb.append("the lazy dog.");

        System.out.println("Final String: " + sb);
    }
}
