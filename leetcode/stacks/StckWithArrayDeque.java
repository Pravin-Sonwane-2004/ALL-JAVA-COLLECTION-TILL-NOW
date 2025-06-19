package stacks;

import java.util.ArrayDeque;

class StckWithArrayDeque {
  private ArrayDeque<Integer> list = new ArrayDeque<>();

  public void push(int val) {
    list.add(val);
  }

  public int pop() {
    if (list.isEmpty()) {
      throw new RuntimeException("Stack is empty");
    }
    return list.pop();
  }
  
  public int peek() {
    if (list.isEmpty()) {
      throw new RuntimeException("Stack is empty");
    }
    return list.peek();
  }

  public static void main(String[] args) {
    ArrayDeque stack = new ArrayDeque<>();
    stack.push(10);
    stack.push(20);
    stack.push(30);

    System.out.println("Top: " + stack.peek()); // Output: 30
    System.out.println("Popped: " + stack.pop()); // Output: 30
    System.out.println("Now Top: " + stack.peek()); // Output: 20
    System.out.println("Empty? " + stack.isEmpty()); // Output: false

  }
}