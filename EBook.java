class EBook extends BaseBook {

    // Constructor
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    // Method to display EBook details
    public void displayEBookDetails() {
        System.out.println("EBook Details:");
        System.out.println("ISBN: " + ISBN); // Accessing public variable
        System.out.println("Title: " + title); // Accessing protected variable
    }
}
/*
EBook eBook = new EBook("987-654-321", "Python Basics", "Alice Smith");
System.out.println();
eBook.displayEBookDetails();

EBook Details:
ISBN: 987-654-321
Title: Python Basics
 */