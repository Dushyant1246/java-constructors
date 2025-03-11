// class definition
public class Circle {
    // Fields
    private double radius;

    // Constructor to initialize values
    Circle(double radius){
        this.radius = radius;
    }

    // Default Constructor
    Circle(){
        this(10);
    }

    // Getter and Setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate circumference
    public double getCircumference(){
        return 2 * Math.PI * this.getRadius();
    }

    // Method to calculate area
    public double getArea(){
        return Math.PI * Math.pow(this.getRadius(),2);
    }

    // Method to display circumference
    public void displayCircumference(){
        System.out.printf("Circumference of circle: %.2f\n", this.getCircumference());
    }

    // Method to display area
    public void displayArea(){
        System.out.printf("Area of circle: %.2f\n", this.getArea());
    }
}
/*
Circle circle1 = new Circle(12.5);
Circle circle2 = new Circle();
circle1.displayArea();
circle1.displayCircumference();
circle2.displayArea();
circle2.displayCircumference();

Area of circle: 490.87
Circumference of circle: 78.54
Area of circle: 314.16
Circumference of circle: 62.83
 */