public class Config {
    // Static variable
    static int staticCount = 100;

    // Instance variable
    String name = "Java";

    public void showDetails() {
        // Local variable
        int localValue = 50;

        // Modifying the static and instance variables
        staticCount += 10;
        name = "Advanced Java";

        System.out.println("Static Variable: " + staticCount);
        System.out.println("Instance Variable: " + name);
        System.out.println("Local Variable: " + localValue);
    }

    public static void main(String[] args) {
        Config demo1 = new Config();
        Config demo2 = new Config();

        // Call method using demo1
        demo1.showDetails();

        // Call method using demo2
        demo2.showDetails();
    }
}
