public class Product {
    // Instance Variables
    private String productName;
    private int price;
    // Class variables
    private static int totalProducts = 0;

    // Constructor
    Product(String productName, int price){
        this.productName = productName;
        this.price = price;
        Product.totalProducts += 1;
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    public static int getTotalProducts() {
        return totalProducts;
    }

    // Instance Method to display product details
    public void displayProductDetails(){
        System.out.println("Product Name: " + this.getProductName());
        System.out.println("Product Price: " + this.getPrice());
    }

    // Class method to display total products
    public static void displayTotalProducts(){
        System.out.println("Total Products: " + Product.getTotalProducts());
    }
}
/*
Product product1 = new Product("Pen", 100);
product1.displayProductDetails();
Product product2 = new Product("Pencil", 10);
product2.displayProductDetails();
Product.displayTotalProducts();

Product Name: Pen
Product Price: 100
Product Name: Pencil
Product Price: 10
Total Products: 2
 */