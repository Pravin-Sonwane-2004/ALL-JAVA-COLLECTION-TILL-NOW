class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("The cat meows.");
    }
}

public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Inherited from Animal
        dog.bark();

        Cat cat = new Cat();
        cat.eat(); // Inherited from Animal
        cat.meow();
    }
}
