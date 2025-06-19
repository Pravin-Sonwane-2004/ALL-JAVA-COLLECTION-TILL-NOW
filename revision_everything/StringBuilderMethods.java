public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        sb.append(" World");
        System.out.println(sb);
        sb.insert(5, " there");
        System.out.println(sb);
        sb.delete(5, 10);
        System.out.println(sb);
        sb.deleteCharAt(5);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.charAt(3));
        System.out.println(sb.indexOf("o"));
        System.out.println(sb.lastIndexOf("o"));
        System.out.println(sb.length());
        System.out.println(sb.substring(5));
        System.out.println(sb.substring(5, 7));
        System.out.println(sb.toString());
        System.out.println(sb.capacity());
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());
    }
}
