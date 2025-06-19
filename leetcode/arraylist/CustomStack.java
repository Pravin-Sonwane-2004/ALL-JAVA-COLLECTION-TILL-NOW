import java.util.ArrayList;

public class CustomStack<T> {
  private ArrayList<T> stack;

  public CustomStack() {
    stack = new ArrayList<>();
  }

  public void push(T value) {
    stack.add(value);
  }

  public T pop() {
    if (isEmpty()) {
      throw new RuntimeException("Stack is empty");
    }
    return stack.remove(stack.size() - 1);
  }

  public T peek() {
    if (isEmpty()) {
      throw new RuntimeException("Stack is empty");
    }
    return stack.get(stack.size() - 1);
  }

  public boolean isEmpty() {
    return stack.isEmpty();
  }

  public int size() {
    return stack.size();
  }

  @Override
  public String toString() {
    return stack.toString();
  }

  public static void main(String[] args) {
    CustomStack<String> customStack = new CustomStack<>();

    customStack.push("Java");
    customStack.push("React");
    customStack.push("AWS");

    System.out.println("Top element: " + customStack.peek());
    System.out.println("Stack before pop: " + customStack);
    System.out.println("Popped: " + customStack.pop());
    System.out.println("Stack after pop: " + customStack);
    System.out.println("Is Empty: " + customStack.isEmpty());
    System.out.println("Size: " + customStack.size());
  }
}
