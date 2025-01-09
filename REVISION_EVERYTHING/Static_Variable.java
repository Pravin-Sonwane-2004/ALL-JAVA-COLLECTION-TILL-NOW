class Static_Variable {
    static int count = 0;// cant we use instance variable here

    Static_Variable() {
        count++;
        System.out.println("Constructor is loaded");
    }
    // Static block to initialize the static variable
    static void displaycount() {
        System.out.println("Static block is executed!");
        System.out.println("total obj created :  " + count);
    }

    public static void main(String[] args) {

        Static_Variable  obj = new Static_Variable();
        Static_Variable  obj1 = new Static_Variable();
        Static_Variable  obj2 = new Static_Variable();
        Static_Variable.displaycount();

        System.out.println("Value of count: " + count);
    }
}
