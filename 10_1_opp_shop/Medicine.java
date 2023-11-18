public class Medicine implements ShopItem {
    private String itemName;
    private double priceBeforeTax;

    private String type;

    public Medicine(String itemName, double priceBeforeTax) {
        this.itemName = itemName;
        this.priceBeforeTax = priceBeforeTax;
        this.type = "Medicine";
    }

    public String getItemName() {
        return itemName;
    }

    public double getPriceBeforeTax() {
        return this.priceBeforeTax;
    }

    public String getType() {
        return type;
    }

    @Override
    public double priceAfterTax() {
        return this.getPriceBeforeTax() + this.taxCount();

    }

    public double taxCount() {
        return this.getPriceBeforeTax() * 9 / 100.0;
    }

}
