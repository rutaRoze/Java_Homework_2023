public class Alcohol implements ShopItem {
    private String itemName;
    private double priceBeforeTax;
    private double alcoholVolume;
    private double packageSize;
    private String type;

    public Alcohol(String itemName, double priceBeforeTax, double alcoholVolume, double packageSize) {
        this.itemName = itemName;
        this.priceBeforeTax = priceBeforeTax;
        this.alcoholVolume = alcoholVolume;
        this.packageSize = packageSize;
        this.type = "Alcohol";
    }

    public String getItemName() {
        return this.itemName;
    }

    public double getPriceBeforeTax() {
        return this.priceBeforeTax;
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

        return this.getPriceBeforeTax() + this.taxCount();
    }

    public double taxCount() {
        double pvmTax = this.getPriceBeforeTax() * 21 / 100.0;
        double exciseTax = 0;
        if (this.getAlcoholVolume() < 15) {
            exciseTax = this.getPackageSize() * 0.86;
        } else {
            exciseTax = this.getPackageSize() * 1.26;
        }

        return pvmTax + exciseTax;
    }

}
