public class BaseBook {
    public String ISBN; // Public variable
    protected String title; // Protected variable
    private String author; // Private variable

    // Constructor
    BaseBook(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public methods to access and modify author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
/*
BaseBook book = new BaseBook("123-456-789", "Java Programming", "John Doe");
book.displayBookDetails();
book.setAuthor("Jane Doe");
System.out.println("\nUpdated Author: " + book.getAuthor());

ISBN: 123-456-789
Title: Java Programming
Author: John Doe

Updated Author: Jane Doe
 */