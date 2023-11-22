package lt.techin.strategy;

public class MaxPriceFilteringStrategy implements FilteringStrategy {

    private double maxPrice;

    public MaxPriceFilteringStrategy(Double maxPrice) {
        this.maxPrice = maxPrice;
    }

    @Override
    public boolean filter(Product product) {
        if (product.getPrice() <= this.maxPrice) {
            return true;
        }
        return false;
    }
}
