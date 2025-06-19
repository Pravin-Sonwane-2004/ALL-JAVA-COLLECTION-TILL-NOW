package revision_everything;
class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        this("Unknown", 18); // Calls the parameterized constructor
    }

    // Parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Constuructor_Chaining {
    public static void main(String[] args) {
        Student student1 = new Student(); // Calls the default constructor
        Student student2 = new Student("Bob", 22); // Calls the parameterized constructor

        student1.display(); // Prints: Name: Unknown, Age: 18
        student2.display(); // Prints: Name: Bob, Age: 22
    }
}
