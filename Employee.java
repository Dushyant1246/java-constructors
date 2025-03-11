class Employee {
    public int employeeID; // Public variable
    protected String department; // Protected variable
    private double salary; // Private variable

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}
/*
Employee emp = new Employee(101, "HR", 50000);
emp.displayEmployeeDetails();
emp.setSalary(55000);
System.out.println("\nUpdated Salary: $" + emp.getSalary());

Employee ID: 101
Department: HR
Salary: $50000.0

Updated Salary: $55000.0
 */