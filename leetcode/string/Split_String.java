public class Split_String {
  public static int lengthOfWords(String s) {
    s = s.trim();
    String[] words = s.split(" ");
    System.out.println();
    return words[words.length - 1].length();
  }

  public static void main(String[] args) {
    Split_String obj = new Split_String();
    System.out.println(obj.lengthOfWords("Hello World")); // Output: 5
  }
}