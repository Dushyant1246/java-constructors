public class Book {
    // Fields
    private String title;
    private String author;
    private double price;

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Constructor to initialize fields
    Book(String title, String author, double price){
        this.author = author;
        this.price = price;
        this.title = title;
    }

    // Default Constructor
    Book(){
        this.author = "";
        this.title = "";
        this.price = 0;
    }

    // Method to display book details
    public void displayDetails(){
        System.out.println("Book title: " + this.getTitle());
        System.out.println("Book author: " + this.getAuthor());
        System.out.printf("Book price: %.2f\n", this.getPrice());
    }
}
/*
Book book1 = new Book("Harry Potter", "J. K. Rowling", 2300);
Book book2 = new Book();
book1.displayDetails();
book2.displayDetails();

Book title: Harry Potter
Book author: J. K. Rowling
Book price: 2300.00
Book title:
Book author:
Book price: 0.00
 */