class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void work() {
        System.out.println(name + " is working.");
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, int teamSize) {
        super(name, id); // Calling parent class constructor
        this.teamSize = teamSize;
    }

    public void manage() {
        System.out.println(name + " manages a team of " + teamSize + " people.");
    }
}
class Director extends Manager {
    String department;

    Director(String name, int id, int teamSize, String department) {
        super(name, id, teamSize);
        this.department = department;
    }

    public void lead() {
        System.out.println(name + " is leading the " + department + " department.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Employee employee = new Employee("Shubham",29);
        employee.work();

        Director director = new Director("Pravin", 102, 110, "Technology");
        director.work(); // Inherited from Employee
        director.manage(); // Inherited from Manager
        director.lead(); // Method of Director
    }
}
