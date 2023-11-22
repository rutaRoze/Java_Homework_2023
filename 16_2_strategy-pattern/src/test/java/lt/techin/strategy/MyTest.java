package lt.techin.strategy;

public class MyTest extends BaseWarehouseTests{


    @Override
    Warehouse getWarehouse() {
        return new WarehouseImplementation();
    }

    @Override
    FilteringStrategy getManufacturerFilteringStrategy(String manufacturer) {
        return new ManufacturerFilteringStrategy(manufacturer);
    }

    @Override
    FilteringStrategy getMaxPriceFilteringStrategy(double maxPrice) {
        return new MaxPriceFilteringStrategy(maxPrice);
    }
}
