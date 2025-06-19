class VariablesExample {
    // Static variable
    static String staticVar = "I am a static variable";

    // Instance variable
    String instanceVar = "I am an instance variable";

    public void display() {
        // Local variable
        String localVar = "I am a local variable";
        System.out.println(localVar);
    }

    public static void main(String[] args) {
        VariablesExample example = new VariablesExample();

        // Access static variable
        System.out.println(VariablesExample.staticVar);

        // Access instance variable
        System.out.println(example.instanceVar);

        // Access local variable
        example.display();
    }
}
