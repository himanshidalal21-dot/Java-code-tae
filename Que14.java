// Base class
class Person {
    void role() {
        System.out.println("I am a Person.");
    }
}

// Employee class (inherits Person)
class Employee extends Person {
    void role() {
        System.out.println("I am an Employee.");
    }
}

// Manager class (inherits Employee)
class Manager extends Employee {
    void role() {
        System.out.println("I am a Manager.");
    }
}

// Main class
public class Que14 {
    public static void main(String[] args) {

        // Runtime Polymorphism
        Person p;

        p = new Person();
        p.role();

        p = new Employee();
        p.role();

        p = new Manager();
        p.role();
    }
}