package lt.techin.strategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Galaxy", 1999, "Samsung"));
        productList.add(new Product("Tom", 899, "do"));
        productList.add(new Product("Bom", 199, "Pa"));
        productList.add(new Product("Ku", 399, "KA"));

        WarehouseImplementation warehouse = new WarehouseImplementation();
        warehouse.addProducts(productList);

        List<Product> listToPrint = warehouse.executeFilteringStrategy(new MaxPriceFilteringStrategy(500.0));

        warehouse.printFilteredProductList(listToPrint);

        System.out.println();

        List<Product> listToPrint2 = warehouse.executeFilteringStrategy(new ManufacturerFilteringStrategy("ka"));

        warehouse.printFilteredProductList(listToPrint2);



    }
}
