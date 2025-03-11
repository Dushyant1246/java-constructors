public class PostgraduateStudent extends Student{
    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    // Method to display postgraduate student details
    public void displayPostgraduateDetails() {
        System.out.println("Postgraduate Student Details:");
        System.out.println("Roll Number: " + rollNumber); // Accessing public variable
        System.out.println("Name: " + name); // Accessing protected variable
    }
}
/*
PostgraduateStudent student2 = new PostgraduateStudent(101, "Dushyant", 8.9);
student2.displayPostgraduateDetails();

Postgraduate Student Details:
Roll Number: 101
Name: Dushyant
 */