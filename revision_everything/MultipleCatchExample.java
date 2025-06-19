package revision_everything;
public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            int result = arr[4]; // ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error occurred.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds.");
        } catch (Exception e) {
            System.out.println("An unknown error occurred: " + e);
        }
        System.out.println("Program continues.");
    }
}
