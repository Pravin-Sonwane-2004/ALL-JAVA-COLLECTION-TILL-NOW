class MathUtils {
    static int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }
}
//in static w dont need to create an object
public class Static_Math_Utils {
    public static void main(String[] args) {
        int sum = MathUtils.add(10, 20);
        int product = MathUtils.multiply(5, 6);

        System.out.println("Sum: " + sum);       // Output: Sum: 30
        System.out.println("Product: " + product); // Output: Product: 30
    }
}
