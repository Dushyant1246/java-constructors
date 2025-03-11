public class LibraryBook {
    // Fields
    private String title;
    private String author;
    private double price;
    private boolean availability;

    // Default Constructor
    LibraryBook(){
        this.title = "";
        this.author = "";
        this.price = 0;
        this.availability = false;
    }

    // Parameterized Constructor
    LibraryBook(String title, String author, double price, boolean availability){
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

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

    public boolean isAvailable() {
        return availability;
    }

    public void setAvailable(boolean availability) {
        this.availability = availability;
    }

    // Method to borrow a book
    public void borrowBook(){
        if(this.isAvailable()){
            this.setAvailable(false);
            System.out.println("Book Borrowed");
        }
        else System.out.println("Book is already booked");
    }
}
/*
LibraryBook book = new LibraryBook("Harry Potter", "J. K. Rowling", 2300, true);
book.borrowBook();
book.borrowBook();

Book Borrowed
Book is already booked
 */
