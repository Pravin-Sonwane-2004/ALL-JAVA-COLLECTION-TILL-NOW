class Constructor_Referance {
    String name;

    Constructor_Referance(String name) {
        this.name = name; // 'this.name' refers to the instance variable, while 'name' is the parameter
    }

    void display() {
        System.out.println("Name: " + name); // Refers to the current object's 'name'
    }
    public static void main(String[] args) {
        Constructor_Referance student = new  Constructor_Referance ("Alice");
        student.display(); // Prints: Name: Alice
    }
}
