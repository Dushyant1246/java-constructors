class Person {
    private String name;
    private int age;

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Person(Person person) {
        this.name = person.name;
        this.age = person.age;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to display data
    void display() {
        System.out.println("Name: " + name + "\nAge: " + age);
    }
}
/*
Person person1 = new Person("Dushyant", 22);
Person person2 = new Person(person1);
person2.display();

Name: Dushyant
Age: 22
 */