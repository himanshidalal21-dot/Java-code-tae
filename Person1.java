class Person1 {
    String name;
    int age;

    Person1(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args){
        Person1 p1 = new Person1("John", 23);
        Person1 p2 = new Person1("Alice",21);
        System.out.println("Person - 1");
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println("Person - 2");
        System.out.println(p2.name);
        System.out.println(p2.age);
    }
}