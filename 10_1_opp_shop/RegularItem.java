public class RegularItem implements ShopItem {

    private String itemName;
    private double priceBeforeTax;

    private String type;

    public RegularItem(String itemName, double priceBeforeTax) {
        this.itemName = itemName;
        this.priceBeforeTax = priceBeforeTax;
        this.type = "Regular item";
    }

    public String getItemName() {
        return itemName;
    }

    public double getPriceBeforeTax() {
        return priceBeforeTax;
    }

    public String getType() {
        return type;
    }

    @Override
    public double priceAfterTax() {
        return this.getPriceBeforeTax() + this.taxCount();
    }

    public double taxCount() {
        return this.getPriceBeforeTax() * 21 / 100.0;

    }

}
