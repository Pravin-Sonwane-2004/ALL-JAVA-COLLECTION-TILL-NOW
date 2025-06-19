package revision_everything;
final class Person {
    private final String name;
    private final int age;

    // Constructor to initialize fields
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // No setter methods, making it immutable
}

public class ImmutableExample {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        
        // person.setName("Bob"); // Error: setName method does not exist
        
        System.out.println(person.getName()); // Output: Alice
        System.out.println(person.getAge());  // Output: 30
    }
}
