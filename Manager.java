class Manager extends Employee {

    // Constructor
    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
    }

    // Method to display manager details
    public void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID); // Accessing public variable
        System.out.println("Department: " + department); // Accessing protected variable
        System.out.println("Salary: $" + getSalary()); // Accessing private salary via getter
    }
}
/*
Manager mgr = new Manager(102, "IT", 75000, "Development Team");
System.out.println();
mgr.displayManagerDetails();

Manager Details:
Employee ID: 102
Department: IT
Salary: $75000.0
 */