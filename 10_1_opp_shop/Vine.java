public class Vine implements ShopItem {

    private String itemName;
    private double priceBeforeTax;
    private double alcoholVolume;
    private double packageSize;
    private String type;

    public Vine(String itemName, double priceBeforeTax, double alcoholVolume, double packageSize) {
        this.itemName = itemName;
        this.priceBeforeTax = priceBeforeTax;
        this.alcoholVolume = alcoholVolume;
        this.packageSize = packageSize;
        this.type = "Vine";
    }

    public String getItemName() {
        return itemName;
    }

    public double getPriceBeforeTax() {
        return priceBeforeTax;
    }

    public double getAlcoholVolume() {
        return this.alcoholVolume;
    }

    public double getPackageSize() {
        return packageSize;
    }

    public String getType() {
        return type;
    }

    @Override
    public double priceAfterTax() {

        return this.getPriceBeforeTax() + taxCount();

    }

    public double taxCount() {
        double pvmTax = this.getPriceBeforeTax() * 21 / 100.0;
        double exciseTax = 0;
        if (this.getAlcoholVolume() < 8.5) {
            exciseTax = this.getPackageSize() * 0.28;
        } else {
            exciseTax = this.getPackageSize() * 0.72;
        }

        return pvmTax + exciseTax;

    }

}
