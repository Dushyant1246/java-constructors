public class Vehicle {
    // Instance Variables
    private String ownerName;
    private String vehicleType;

    // Class Variable (Static)
    private static double registrationFee = 100.0; // Default registration fee

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public static double getRegistrationFee() {
        return registrationFee;
    }

    // Instance Method to Display Vehicle Details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + this.getOwnerName());
        System.out.println("Vehicle Type: " + this.getVehicleType());
        System.out.println("Registration Fee: $" + Vehicle.getRegistrationFee());
    }

    // Class Method to Update Registration Fee
    public static void updateRegistrationFee(double fee) {
        Vehicle.registrationFee = fee;
    }
}
/*
Vehicle vehicle1 = new Vehicle("A", "Car");
Vehicle vehicle2 = new Vehicle("B", "Truck");
vehicle1.displayVehicleDetails();
vehicle2.displayVehicleDetails();

Vehicle.updateRegistrationFee(150);

vehicle1.displayVehicleDetails();
vehicle2.displayVehicleDetails();

Output:
Owner Name: A
Vehicle Type: Car
Registration Fee: $100.0
Owner Name: B
Vehicle Type: Truck
Registration Fee: $100.0
Owner Name: A
Vehicle Type: Car
Registration Fee: $150.0
Owner Name: B
Vehicle Type: Truck
Registration Fee: $150.0
 */