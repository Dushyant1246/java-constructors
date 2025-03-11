public class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Student Details: ");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }

    // Access and modify CGPA using public methods
    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}
/*
Student student1 = new Student(100, "Alice", 8.4);
student1.setCGPA(9.2);
student1.displayStudentDetails();

Student Details:
Roll Number: 100
Name: Alice
CGPA: 9.2
 */
