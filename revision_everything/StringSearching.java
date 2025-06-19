package revision_everything;
public class StringSearching {
    public static void main(String[] args) {
        String str = "Java Programming";

        // First occurrence
        System.out.println("Index of 'a': " + str.indexOf('a'));  // 1
        System.out.println("Index of 'Programming': " + str.indexOf("Programming"));  // 5

        // Last occurrence
        System.out.println("Last Index of 'a': " + str.lastIndexOf('a'));  // 13
    }
}

