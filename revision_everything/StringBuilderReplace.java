package revision_everything;
public class StringBuilderReplace {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Good Morning");

        // Replace substring
        sb.replace(5, 12, "Evening");
        System.out.println("After replace: " + sb);  // Good Evening
    }
}
