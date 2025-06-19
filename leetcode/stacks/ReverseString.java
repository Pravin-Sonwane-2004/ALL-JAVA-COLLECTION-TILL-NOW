package stacks;

import java.util.ArrayDeque;

public class ReverseString {
  public static String reverse(String str) {
    ArrayDeque<Character> stack = new ArrayDeque<>();
    for (char ch : str.toCharArray()) {
      stack.push(ch);
    }
    StringBuilder reversed = new StringBuilder();
    while (!stack.isEmpty()) {
      reversed.append(stack.pop());
    }
    return reversed.toString();
  }

  public static void main(String[] args) {
    String input = "Pravin";
    String output = reverse(input);
    System.out.println("Original: " + input);
    System.out.println("Reversed: " + output);
  }
}
