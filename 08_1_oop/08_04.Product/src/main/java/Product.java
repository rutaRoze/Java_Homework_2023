public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }

    public void printProduct() {
        System.out.printf("%s, %.2f, %d pcs", this.name, this.price, this.quantity);
    }
}
