package revision_everything;
public class DataTypeDemo {
    // Static variable
    static int staticCount = 100;

    // Instance variable
    String name = "Java";

    public void showDetails() {
        // Local variable
        int localValue = 50;

        System.out.println("Static Variable: " + staticCount);
        System.out.println("Instance Variable: " + name);
        System.out.println("Local Variable: " + localValue);
    }

    public static void main(String[] args) {
        DataTypeDemo demo = new DataTypeDemo();
        demo.showDetails();
    }
}
