public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.balance = initialBalance;
        changeHistory = new ChangeHistory();
        changeHistory.add(initialBalance);
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        changeHistory.add(super.balance);
    }


    public double takeFromWarehouse(double amount) {
        double taken = super.takeFromWarehouse(amount);
        changeHistory.add(super.balance);
        return taken;
    }

    public String history() {
        return changeHistory.toString();
    }

    public void printAnalysis() {
        String analysis = "Product: " + super.getName() +
                "\nHistory: " + this.history() +
                "\nLargest amount of product: " + changeHistory.maxValue() +
                "\nSmallest amount of product: " + changeHistory.minValue() +
                "\nAverage: " + changeHistory.average();

        System.out.println(analysis);
    }

}
