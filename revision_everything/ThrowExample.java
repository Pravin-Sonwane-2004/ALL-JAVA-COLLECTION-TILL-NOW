package revision_everything;
public class ThrowExample {
    public static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote.");
        }
        System.out.println("You are eligible to vote.");
    }

    public static void main(String[] args) {
        try {
            checkAge(15); // This will throw an exception
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
