public class CarRental{
    // Fields
    private String customerName;
    private String carModel;
    private int rentalDays;

    // Default Constructor
    CarRental(){
        this.customerName = "";
        this.carModel = "";
        this.rentalDays = 0;
    }

    // Parameterized Constructor
    CarRental(String customerName, String carModel, int rentalDays){
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Getters and Setters
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public int totalCost(int rentalPrice){
        return this.getRentalDays() * rentalPrice;
    }
}
/*
CarRental carRental = new CarRental("Dushyant", "BMW", 5);
System.out.println("Total cost for rental Price 500: " + carRental.totalCost(500));

Total cost for rental Price 500: 2500
 */